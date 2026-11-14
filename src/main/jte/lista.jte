@import com.example.cardapiosemana.Prato
@param java.util.List<Prato> pratos

<h2>Pratos planejados</h2>

@if(pratos.isEmpty())
    <p>Nenhum prato planejado ainda.</p>
@else
    @for(var prato : pratos)
        <section>
            <h3>${prato.getNome()}</h3>
            <p>Tipo: ${prato.getTipo()}</p>
            <p>Categoria: ${prato.getCategoria()}</p>
            <p>Porções: ${prato.getPorcoes()}</p>
            <p>Data: ${prato.getDataPlanejada().toString()}</p>
            <p>Observação: ${prato.getObservacao()}</p>

            <form action="/pratos/realizar" method="post">
                <input type="hidden" name="nome" value="${prato.getNome()}">
                <button type="submit">Marcar como realizado</button>
            </form>
        </section>
    @endfor
@endif