@import com.example.cardapiosemana.Prato

@param java.util.List<Prato> pratos

<link rel="stylesheet" href="/css/style.css">

<h2>Pratos realizados</h2>

@if(pratos.isEmpty())
    <p>Nenhum prato realizado ainda.</p>
@else
    @for(var prato : pratos)
        <section>
            <h3>${prato.getNome()}</h3>
            <p>Tipo: ${prato.getTipo()}</p>
            <p>Categoria: ${prato.getCategoria()}</p>
            <p>Porções: ${prato.getPorcoes()}</p>
            <p>Data: ${prato.getDataPlanejada().toString()}</p>
            <p>Observação: ${prato.getObservacao()}</p>
        </section>
    @endfor
@endif
