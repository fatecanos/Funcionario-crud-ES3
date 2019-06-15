<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Cadastro de Usu�rio</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="author" content="Guilherme Puras & Lucas Nogueira" />

<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" />
</head>
<body>
	<div class="container-fluid h-100 bg-secondary">
		<div class="col-6 offset-3 h-100">
			<div class="card card-cad-usuario">
				<div class="card-header">
					<h3 class="text-center">Cadastro de Usu�rio</h3>
				</div>
				<div class="card-body">
					<form action="Servico" method="GET">
						<div class="form-group">
							<label class="font-weight-bold" for="usuario">Usu�rio</label>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-user"></i></span>
								</div>
								<input class="form-control" id="usuario" type="text"
									name="nome" placeholder="Insira Seu Nome de Usu�rio"
									required />
							</div>
						</div>

						<div class="form-group">
							<label class="font-weight-bold" for="senha">Senha:</label>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input class="form-control" id="senha" type="password"
									name="senha" placeholder="Insira Sua Senha" required />
							</div>
						</div>

						<div class="form-group">
							<label class="font-weight-bold" for="confirmaSenha">Confirme a senha:</label>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input class="form-control" id="senha" type="password"
									name="confirmaSenha" placeholder="Confirme Sua Senha" required />
							</div>
						</div>
						
						<!--GRUPO DE SELECTS -->
						<div class="row PerfisSelecao">
							<div class="col-md-5">
								<label>Perfis:</label>
								<select id="listaDireita" class="custom-select" multiple>
									<option value="ATENDENTE">ATENDENTE</option>
									<option value="ADMINISTRADOR">ADMINISTRADOR</option>
                                    <option value="TRIAGEM_INICIAL">TRIAGEM_INICIAL</option>
                                    <option value="TRIAGEM_GRUPO">TRIAGEM_GRUPO</option>
                                    <option value="ADMINISTRADOR_SISTEMA">ADM_SISTEMA</option>
								</select>
							</div>
							<div class="col-md-2">
                                <button class="btnSelecao" id="moveEsquerda"><i class="fas fa-arrow-right"></i></button>
                                <button class="btnSelecao" id="moveTudoEsquerda"><i class="fas fa-angle-double-right"></i></button>
								<button class="btnSelecao" id="moveDireita"><i class="fas fa-arrow-left"></i></button>
								<button class="btnSelecao" id="moveTudoDireita"><i class="fas fa-angle-double-left"></i></button>
							</div>
							<div class="col-md-5">
								<label for="perfilSelecao">Perfis escolhidos:</label>
								<select name="perfilSelecao" id="listaEsquerda" class ="custom-select" multiple>
								</select>
							</div>
						</div>
						
						
						<input type="hidden" name="operacao" value="salvar">
						<input type="hidden" name="metodo" value="/CadastrarUsuario">
						<input class="d-none" type="submit" id="botaoCadastrar" />
					</form>
				</div>

				<div class="card-footer">
					<div class="row justify-content-between">
						<a href="index.jsp"><label class="btn btn-outline-primary">Voltar</label></a>
						<label class="btn btn-success" for="botaoCadastrar" onclick="selecionaTodos()"> Cadastrar </label>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="js/jquery/jquery.slim.min.js"></script>
	<script src="js/popper/popper.min.js"></script>
	<script src="js/bootstrap/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>