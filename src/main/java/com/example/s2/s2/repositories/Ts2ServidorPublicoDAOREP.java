package com.example.s2.s2.repositories;

import java.util.List;

import com.example.s2.s2.interfaces.Ts2ServidorPublicoDAO;
import com.example.s2.s2.mappers.Ts2ServidorPublicoRowMapper;
import com.example.s2.s2.models.Ts2ServidorPublico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Ts2ServidorPublicoDAOREP implements Ts2ServidorPublicoDAO {

    @Autowired
    private JdbcTemplate template;

    public Ts2ServidorPublicoDAOREP(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Ts2ServidorPublico> findAll() {
        return template.query("select * from ts2_servidor_publico AS sp "
                + "INNER JOIN ts2_tipo_de_genero AS tg ON sp.id_tipo_de_genero = tg.id_tipo_de_genero "
                + "INNER JOIN ts2_tipo_de_ramo AS tr ON sp.id_tipo_de_ramo = tr.id_tipo_de_ramo "
                + "INNER JOIN ts2_tipo_de_ente_publico AS tep ON sp.id_tipo_de_ente_publico = tep.id_tipo_de_ente_publico "
                + "INNER JOIN ts2_tipo_de_puesto AS tp ON sp.id_tipo_de_puesto = tp.id_tipo_de_puesto ",
                new Ts2ServidorPublicoRowMapper());
    }

    @Override
    public ResponseEntity<List<Ts2ServidorPublico>> findAllServidor() {
        List<Ts2ServidorPublico> po = template.query("select * from ts2_servidor_publico AS sp "
        + "INNER JOIN ts2_tipo_de_genero AS tg ON sp.id_tipo_de_genero = tg.id_tipo_de_genero "
        + "INNER JOIN ts2_tipo_de_ramo AS tr ON sp.id_tipo_de_ramo = tr.id_tipo_de_ramo "
        + "INNER JOIN ts2_tipo_de_ente_publico AS tep ON sp.id_tipo_de_ente_publico = tep.id_tipo_de_ente_publico "
        + "INNER JOIN ts2_tipo_de_puesto AS tp ON sp.id_tipo_de_puesto = tp.id_tipo_de_puesto ",
        new Ts2ServidorPublicoRowMapper());
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("S2", "Servidores Publicos");
        responseHeaders.add("pageSize", String.valueOf(po.size()));
        responseHeaders.add("page", String.valueOf(1));
        responseHeaders.add("totalRows", String.valueOf(po.size()));
        responseHeaders.add("hasNextPage", "false");
        
        return new ResponseEntity<List<Ts2ServidorPublico>>(po,responseHeaders,HttpStatus.CREATED);
    }

}