@param String titulo
@param gg.jte.Content conteudo

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${titulo}</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<header>
    <h1>Cardápio da Semana</h1>
</header>

<aside>
    @include("components/menu.jte")
</aside>

<main>
    ${conteudo}
</main>

</body>
</html>