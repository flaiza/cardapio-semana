package gg.jte.generated.ondemand;
import com.example.cardapiosemana.Prato;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtefeitosGenerated {
	public static final String JTE_NAME = "feitos.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,6,6,8,8,9,9,11,11,11,12,12,12,13,13,13,14,14,14,15,15,15,16,16,16,18,18,19,19,20,0,0,2,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<Prato> pratos) {
		jteOutput.writeContent("\r\n<h2>Pratos realizados</h2>\r\n\r\n");
		if (pratos.isEmpty()) {
			jteOutput.writeContent("\r\n    <p>Nenhum prato realizado ainda.</p>\r\n");
		} else {
			jteOutput.writeContent("\r\n    ");
			for (var prato : pratos) {
				jteOutput.writeContent("\r\n        <section>\r\n            <h3>");
				jteOutput.setContext("h3", null);
				jteOutput.writeUserContent(prato.getNome());
				jteOutput.writeContent("</h3>\r\n            <p>Tipo: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(prato.getTipo());
				jteOutput.writeContent("</p>\r\n            <p>Categoria: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(prato.getCategoria());
				jteOutput.writeContent("</p>\r\n            <p>Porções: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(prato.getPorcoes());
				jteOutput.writeContent("</p>\r\n            <p>Data: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(prato.getDataPlanejada().toString());
				jteOutput.writeContent("</p>\r\n            <p>Observação: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(prato.getObservacao());
				jteOutput.writeContent("</p>\r\n        </section>\r\n    ");
			}
			jteOutput.writeContent("\r\n");
		}
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<Prato> pratos = (java.util.List<Prato>)params.get("pratos");
		render(jteOutput, jteHtmlInterceptor, pratos);
	}
}
