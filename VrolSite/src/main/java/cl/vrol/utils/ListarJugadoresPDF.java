/*
 * 
 */
package cl.vrol.utils;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import cl.vrol.models.entity.Jugador;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * The Class ListarJugadoresPDF.
 */
@Component("/views/jugadores/listarinscritos")
public class ListarJugadoresPDF extends AbstractPdfView{

	@Override
	public void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		ByteArrayOutputStream baos  = new ByteArrayOutputStream();
		
		List<Jugador> listaInscritos = (List<Jugador>) model.get("inscritos");
		
		/* Fuentes, Tamaños y colores*/
		Font fuenteTitulo = FontFactory.getFont("Verdana", 16, Color.white);
		Font fuenteTitCol = FontFactory.getFont("Verdana", 12, Color.DARK_GRAY);
		Font fuenteCeldas = FontFactory.getFont("Verdana", 10, Color.BLACK);
		
		document.setPageSize(PageSize.LETTER.rotate());
		document.setMargins(-25, -25, 40, 20);
		document.open();
		PdfPCell celda = null;
		
		PdfPTable tablaTitulo = new PdfPTable(1);
		
		celda = new PdfPCell(new Phrase("Listado de Jugadores por Mesa", fuenteTitulo));
		celda.setBorder(0);
		celda.setBackgroundColor(new Color(0,113,214));
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(20);
		
		tablaTitulo.addCell(celda);
		tablaTitulo.setSpacingAfter(30);
		
		/* Tabla para mostrar Listado de Jugadores Inscritos */
		PdfPTable tablaPlayers = new PdfPTable(7);
		tablaPlayers.setWidths(new float[] {0.5f, 1.3f, 2f, 1f, 2f, 1f, 1f});
		
		celda = new PdfPCell(new Phrase("Id", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		celda = new PdfPCell(new Phrase("Nombre Jugador", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		celda = new PdfPCell(new Phrase("E-mail Contacto", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		celda = new PdfPCell(new Phrase("Telefono Contacto", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		celda = new PdfPCell(new Phrase("Nombre de Mesa", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		celda = new PdfPCell(new Phrase("Juego", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		celda = new PdfPCell(new Phrase("Narrador", fuenteTitCol));
		celda.setBackgroundColor(Color.LIGHT_GRAY);
		celda.setHorizontalAlignment(Element.ALIGN_CENTER);
		celda.setVerticalAlignment(Element.ALIGN_CENTER);
		celda.setPadding(10);
		tablaPlayers.addCell(celda);
		
		/* Bucle for para mostrar datos de los jugadores*/
		
		for (Jugador player : listaInscritos) {
			celda = new PdfPCell(new Phrase(player.getIdInscrito().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
			
			celda = new PdfPCell(new Phrase(player.getNombreJugador().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
			
			celda = new PdfPCell(new Phrase(player.getEmail().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
			
			celda = new PdfPCell(new Phrase(player.getTelefono().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
			
			celda = new PdfPCell(new Phrase(player.getMesa().getNombreMesa().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
			
			celda = new PdfPCell(new Phrase(player.getMesa().getJuego().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
			
			celda = new PdfPCell(new Phrase(player.getMesa().getNarrador().toString(), fuenteCeldas));
			celda.setPadding(5);
			tablaPlayers.addCell(celda);
		}
		
		document.add(tablaTitulo);
		document.add(tablaPlayers);
	}

}
