package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteformularioGenerated {
	public static final String JTE_NAME = "formulario.jte";
	public static final int[] JTE_LINE_INFO = {38,0,0,0,0,0,0,38,0,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<link rel=\"stylesheet\" href=\"/css/style.css\">\r\n\r\n<h2>Adicionar novo prato</h2>\r\n\r\n<form action=\"/pratos/novo\" method=\"post\">\r\n\r\n    <label>Nome do prato:</label>\r\n    <input type=\"text\" name=\"nome\" required>\r\n\r\n    <br><br>\r\n\r\n    <label>Tipo:</label>\r\n    <input type=\"text\" name=\"tipo\" required>\r\n\r\n    <br><br>\r\n\r\n    <label>Categoria:</label>\r\n    <input type=\"text\" name=\"categoria\" required>\r\n\r\n    <br><br>\r\n\r\n    <label>Quantidade de porções:</label>\r\n    <input type=\"number\" name=\"porcoes\" min=\"1\" required>\r\n\r\n    <br><br>\r\n\r\n    <label>Data planejada:</label>\r\n    <input type=\"date\" name=\"dataPlanejada\" required>\r\n\r\n    <br><br>\r\n\r\n    <label>Observação:</label>\r\n    <textarea name=\"observacao\"></textarea>\r\n\r\n    <br><br>\r\n\r\n    <button type=\"submit\">Salvar prato</button>\r\n\r\n</form>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
