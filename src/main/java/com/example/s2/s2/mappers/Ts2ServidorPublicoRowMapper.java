package com.example.s2.s2.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.s2.s2.models.Ts2ServidorPublico;
import com.example.s2.s2.models.Ts2TipoDeEntePublico;
import com.example.s2.s2.models.Ts2TipoDeGenero;
import com.example.s2.s2.models.Ts2TipoDePuesto;
import com.example.s2.s2.models.Ts2TipoDeRamo;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ts2ServidorPublicoRowMapper implements RowMapper<Ts2ServidorPublico> {

    @Override
    public Ts2ServidorPublico mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ts2ServidorPublico ts2ServidorPublico = new Ts2ServidorPublico();
        ts2ServidorPublico.setId(rs.getString("id"));
        ts2ServidorPublico.setFechacaptura(rs.getDate("fechaCaptura"));
        ts2ServidorPublico.setEjerciciofiscal(rs.getString("ejercicioFiscal"));
        ts2ServidorPublico.setFechainicialdelejercicio(rs.getDate("fechaInicialDelEjercicio"));
        ts2ServidorPublico.setFechafinaldelejercicio(rs.getDate("fechaFinalDelEjercicio"));
        
        ts2ServidorPublico.setIdTipoDeRamo(new Ts2TipoDeRamo(rs.getInt("id_tipo_de_ramo"),rs.getString(27),rs.getInt(28)));
        
        ts2ServidorPublico.setRfc(rs.getString("rfc"));
        ts2ServidorPublico.setCurp(rs.getString("curp"));
        ts2ServidorPublico.setNombres(rs.getString("nombres"));
        ts2ServidorPublico.setPrimerapellido(rs.getString("primerapellido"));
        ts2ServidorPublico.setSegundoapellido(rs.getString("segundoapellido"));
        
        ts2ServidorPublico.setIdTipoDeGenero(new Ts2TipoDeGenero(rs.getInt("id_tipo_de_genero"),rs.getString("valor"),rs.getString("clave")));
        
        ts2ServidorPublico.setIdTipoDeEntePublico(new Ts2TipoDeEntePublico(rs.getInt(29),rs.getString(30),rs.getString(31),rs.getString(32),rs.getString(33)));

        ts2ServidorPublico.setIdTipoDePuesto(new Ts2TipoDePuesto(rs.getInt(34),rs.getString(35),rs.getString(36),rs.getString(37),rs.getString(38)));

        ts2ServidorPublico.setFechaDeRegistro(rs.getDate("fecha_de_registro"));
        ts2ServidorPublico.setUsuarioDeRegistro(rs.getString("usuario_de_registro"));
        ts2ServidorPublico.setFechaDeModificacion(rs.getDate("fecha_de_modificacion"));
        ts2ServidorPublico.setUsuarioDeModificacion(rs.getString("usuario_de_modificacion"));
        ts2ServidorPublico.setRevisado(rs.getInt("revisado"));
        ts2ServidorPublico.setObservacionesVerificacion(rs.getString("observaciones_verificacion"));
        ts2ServidorPublico.setFechaDeRevision(rs.getDate("fecha_de_revision"));
        ts2ServidorPublico.setUsuarioDeRevision(rs.getString("usuario_de_revision"));
        return ts2ServidorPublico;
    }
    
}