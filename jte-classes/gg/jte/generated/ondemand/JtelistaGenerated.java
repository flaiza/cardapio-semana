package gg.jte.generated.ondemand;
import com.example.cardapiosemana.Prato;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtelistaGenerated {
	public static final String JTE_NAME = "lista.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,7,7,9,9,10,10,12,12,12,13,13,13,14,14,14,15,15,15,16,16,16,17,17,17,20,20,20,20,20,20,20,20,20,24,24,25,25,0,0,1,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<Prato> pratos) {
		jteOutput.writeContent("\r\n<link rel=\"stylesheet\" href=\"/css/style.css\">\r\n\r\n<h2>Pratos planejados</h2>\r\n\r\n");
		if (pratos.isEmpty()) {
			jteOutput.writeContent("\r\n    <p>Nenhum prato planejado ainda.</p>\r\n");
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
				jteOutput.writeContent("</p>\r\n\r\n            <form action=\"/pratos/realizar\" method=\"post\">\r\n                <input type=\"hidden\" name=\"nome\"");
				var __jte_html_attribute_0 = prato.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                <button type=\"submit\">Marcar como realizado</button>\r\n            </form>\r\n        </section>\r\n    ");
			}
			jteOutput.writeContent("\r\n");
		}
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<Prato> pratos = (java.util.List<Prato>)params.get("pratos");
		render(jteOutput, jteHtmlInterceptor, pratos);
	}
}
