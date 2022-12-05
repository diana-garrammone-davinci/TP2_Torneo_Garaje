
import java.util.Date;

import garaje.Coche;
import garaje.Garaje;
import torneo.Equipo;
import torneo.Grupo;
import torneo.Llave;
import torneo.Partido;
import torneo.Resultado;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("GRUPO 1");
		Grupo g1 = new Grupo("Etapa Grupos - Grupo1");
		
		
		Equipo argentina = new Equipo("Argentina");
        Equipo mexico = new Equipo("Mexico");
        Equipo polonia = new Equipo("Polonia");
        Equipo arabia = new Equipo("Arabia");       

        Partido p1G1 = new Partido(new Date(2022, 10, 10), argentina, arabia);
        Partido p2G1 = new Partido(new Date(2022, 10, 9), argentina, polonia);
        Partido p3G1 = new Partido(new Date(2022, 10, 8), argentina, mexico);
        Partido p4G1 = new Partido(new Date(2022,10,7),mexico,polonia);
        Partido p5G1 = new Partido(new Date(2022,10,7),arabia,polonia);
        Partido p6G1 = new Partido(new Date(2022,10,11),mexico,arabia);
        System.out.println("Partidos del Grupo 1");
        System.out.println(p1G1);
        System.out.println(p2G1);
        System.out.println(p3G1);
        System.out.println(p4G1);
        System.out.println(p5G1);
        System.out.println(p6G1);
        System.out.println(" ");


        Resultado rP1G1 = new Resultado(2,0);
        Resultado rP2G1 = new Resultado(3,2);
        Resultado rP3G1 = new Resultado(3,2);
        Resultado rP4G1 = new Resultado(0,0);
        Resultado rP5G1 = new Resultado(3,4);
        Resultado rP6G1 = new Resultado(3,8);
        System.out.println("Resultados del Grupo 1");
        System.out.println(rP1G1);
        System.out.println(rP2G1);
        System.out.println(rP3G1);
        System.out.println(rP4G1);
        System.out.println(rP5G1);
        System.out.println(rP6G1);
        System.out.println(" ");

        p1G1.setResultado(rP1G1);
        p2G1.setResultado(rP2G1);
        p3G1.setResultado(rP3G1);
        p4G1.setResultado(rP4G1);
        p5G1.setResultado(rP5G1);
        p6G1.setResultado(rP6G1);
        
        g1.addPartido(p1G1);
        g1.addPartido(p2G1);
        g1.addPartido(p3G1);
        g1.addPartido(p4G1);
        g1.addPartido(p5G1);
        g1.addPartido(p6G1);
        
        System.out.println("Puntaje Argentina: " + argentina.getPuntajeEtapaGrupo());
        System.out.println("Puntaje Mexico: " + mexico.getPuntajeEtapaGrupo());
        System.out.println("Puntaje Polonia: " + polonia.getPuntajeEtapaGrupo());
        System.out.println("Puntaje Arabia: " + arabia.getPuntajeEtapaGrupo());
        System.out.println(" ");
        
        g1.addEquipoQueAvanza(argentina);
        g1.addEquipoQueAvanza(polonia);
        System.out.println("Equipos que avanzan del grupo 1:");
        System.out.println(g1.getEquiposQueAvanzan().get(0).getNombre() +" - " + g1.getEquiposQueAvanzan().get(1).getNombre());
        System.out.println(" ");
        
        System.out.println("GRUPO 2");
        Grupo g2 = new Grupo("Etapa Grupos - Grupo2");
       
        
        Equipo francia = new Equipo("Francia");
        Equipo holanda = new Equipo("Holanda");
        Equipo italia = new Equipo("Italia");
        Equipo uruguay = new Equipo("Uruguay");
        
        Partido p1G2 = new Partido(new Date(2022, 10, 10), francia, holanda);
        Partido p2G2 = new Partido(new Date(2022, 10, 9), francia, italia);
        Partido p3G2 = new Partido(new Date(2022, 10, 8), francia, uruguay);
        Partido p4G2 = new Partido(new Date(2022,10,7), holanda, italia);
        Partido p5G2 = new Partido(new Date(2022,10,7), holanda, uruguay);
        Partido p6G2 = new Partido(new Date(2022,10,11), uruguay, italia);
        System.out.println("Partidos del Grupo 2");
        System.out.println(p1G2);
        System.out.println(p2G2);
        System.out.println(p3G2);
        System.out.println(p4G2);
        System.out.println(p5G2);
        System.out.println(p6G2);
        System.out.println(" ");
        
        Resultado rP1G2 = new Resultado(2,0);
        Resultado rP2G2 = new Resultado(3,2);
        Resultado rP3G2 = new Resultado(3,2);
        Resultado rP4G2 = new Resultado(0,0);
        Resultado rP5G2 = new Resultado(3,4);
        Resultado rP6G2 = new Resultado(3,8);
        System.out.println("Resultados del Grupo 2");
        System.out.println(rP1G2);
        System.out.println(rP2G2);
        System.out.println(rP3G2);
        System.out.println(rP4G2);
        System.out.println(rP5G2);
        System.out.println(rP6G2);
        System.out.println(" ");
        
        p1G2.setResultado(rP1G2);
        p2G2.setResultado(rP2G2);
        p3G2.setResultado(rP3G2);
        p4G2.setResultado(rP4G2);
        p5G2.setResultado(rP5G2);
        p6G2.setResultado(rP6G2);
        
        g2.addPartido(p1G2);
        g2.addPartido(p2G2);
        g2.addPartido(p3G2);
        g2.addPartido(p4G2);
        g2.addPartido(p5G2);
        g2.addPartido(p6G2);
        
        System.out.println("Puntaje Francia: " + francia.getPuntajeEtapaGrupo());
        System.out.println("Puntaje Holanda: " + holanda.getPuntajeEtapaGrupo());
        System.out.println("Puntaje Uruguay: " + uruguay.getPuntajeEtapaGrupo());
        System.out.println("Puntaje Italia: " + italia.getPuntajeEtapaGrupo());
        System.out.println(" ");
        
        g2.addEquipoQueAvanza(francia);
        g2.addEquipoQueAvanza(italia);
        System.out.println("Equipos que avanzan del grupo 2:");
        System.out.println(g2.getEquiposQueAvanzan().get(0).getNombre() +" - " + g2.getEquiposQueAvanzan().get(1).getNombre());
        System.out.println(" ");
        
        System.out.println("GRUPO 3");
        Grupo g3 = new Grupo("Etapa Grupos - Grupo3");
        

        Equipo camerun = new Equipo("Camerun");
        Equipo rusia = new Equipo("Rusia");
        Equipo brasil = new Equipo("Brasil");
        Equipo eeuu = new Equipo("EEUU");

        Equipo canada = new Equipo("Canada");
        
        
        Grupo g4 = new Grupo("Etapa Grupos - Grupo4");
        
        Grupo g5 = new Grupo("Etapa Grupos - Grupo5");
        
        Grupo g6 = new Grupo("Etapa Grupos - Grupo6");
        
        Grupo g7 = new Grupo("Etapa Grupos - Grupo7");
        
        Grupo g8 = new Grupo("Etapa Grupos - Grupo8");
        

        Llave lOctavos = new Llave("Octavos de final del toreno");
        Llave lCuartos = new Llave("Cuartos de final del torneo");
        Llave lSemis = new Llave("Semifinales del torneo");
        Llave lFinal = new Llave("Etapa final del torneo");
        
        
        System.out.println("GARAJE:");
        
        Coche c1 = new Coche("Chevrolet", 10000, 3, 4);
		Coche c2 = new Coche("Chevrolet", 10000, 1, 4);
		
		Garaje ga1 = new Garaje(true, 2000, 1000);
		
		System.out.println(ga1.consultaCapacidadCoches(ga1.getCapacidadCoches()));
		
		ga1.ingresarCoche(c1);
		
		System.out.println(ga1.getCapacidadCoches());
		
		System.out.println(ga1.consultaCapacidadCoches(ga1.getCapacidadCoches()));
		
		ga1.setCapacidadCoches(200);
		
		System.out.println(ga1.consultaCapacidadCoches(ga1.getCapacidadCoches()));
		
		ga1.egresarCoche(c1);
		
		System.out.println(ga1.consultaCapacidadCoches(ga1.getCapacidadCoches()));
		
		System.out.println(ga1.cambiarRuedaCoche(c1));
		
		System.out.println(ga1.calcularPrecioTodasLasRuedasCambiadas());
		
		ga1.ingresarCoche(c2);
		System.out.println(ga1.cambiarRuedaCoche(c2));
		
		System.out.println(ga1.calcularPrecioTodasLasRuedasCambiadas());
		
		//no está funcionando mi idea de que contadorCoche guarde el valor del coche anterior, para calcular el precio de todas las ruedas cambiadas.
  

	}

}
