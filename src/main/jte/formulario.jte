<link rel="stylesheet" href="/css/style.css">

<h2>Adicionar novo prato</h2>

<form action="/pratos/novo" method="post">

    <label>Nome do prato:</label>
    <input type="text" name="nome" required>

    <br><br>

    <label>Tipo:</label>
    <input type="text" name="tipo" required>

    <br><br>

    <label>Categoria:</label>
    <input type="text" name="categoria" required>

    <br><br>

    <label>Quantidade de porções:</label>
    <input type="number" name="porcoes" min="1" required>

    <br><br>

    <label>Data planejada:</label>
    <input type="date" name="dataPlanejada" required>

    <br><br>

    <label>Observação:</label>
    <textarea name="observacao"></textarea>

    <br><br>

    <button type="submit">Salvar prato</button>

</form>