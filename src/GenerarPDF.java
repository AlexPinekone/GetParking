
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class GenerarPDF {
    private Font fuenteEnNegritas = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
    private Font fuenteEnNormal = new Font(Font.FontFamily.COURIER, 10, Font.NORMAL);
    
    public void GenerarPDF(String Titulo, String Cliente, String Lugar, String Costo, String Salida){
        try {
            Document d = new Document(PageSize.A6, 36, 36, 10, 10);
            PdfWriter.getInstance(d, new FileOutputStream(Salida));
            d.open();
            d.add(getTitulo(Titulo));
            d.add(getCliente(Cliente));
            d.add(getLugar(Lugar));
            d.add(getCosto(Costo));
            d.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Paragraph getTitulo(String Texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(this.fuenteEnNegritas);
        p.add(c);
        return p;
    }
    
    public Paragraph getCliente(String Texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_LEFT);
        c.append(Texto);
        c.setFont(this.fuenteEnNormal);
        p.add(c);
        return p;
    }
    
    public Paragraph getCosto(String Texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_RIGHT);
        c.append(Texto);
        c.setFont(this.fuenteEnNormal);
        p.add(c);
        return p;
    }
    
    public Paragraph getLugar(String Texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_LEFT);
        c.append(Texto);
        c.setFont(this.fuenteEnNormal);
        p.add(c);
        return p;
    }
}
