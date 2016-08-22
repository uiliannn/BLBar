-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 07-Nov-2015 às 23:02
-- Versão do servidor: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `blbar`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixa`
--

CREATE TABLE IF NOT EXISTS `caixa` (
  `CODIGO` int(10) unsigned NOT NULL,
  `DINHEIRO` float NOT NULL DEFAULT '0',
  `CHEQUE` float NOT NULL DEFAULT '0',
  `CARTAO` float NOT NULL DEFAULT '0',
  `VALE` float NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `caixa`
--

INSERT INTO `caixa` (`CODIGO`, `DINHEIRO`, `CHEQUE`, `CARTAO`, `VALE`) VALUES
(1, 2815.95, 577.4, 32.55, 114.06);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidade`
--

CREATE TABLE IF NOT EXISTS `cidade` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(50) CHARACTER SET latin1 NOT NULL,
  `fk_cod_estado` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cidade`
--

INSERT INTO `cidade` (`codigo`, `nome`, `fk_cod_estado`) VALUES
(1, 'Ubá', 11),
(2, 'Tocantins', 11),
(3, 'Vicosa', 11);

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `COD_CIDADE` int(11) DEFAULT NULL,
  `COD_ESTADO` int(11) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL,
  `CPF_CNPJ` varchar(100) CHARACTER SET utf8 NOT NULL,
  `OBSERVACAO` varchar(300) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`, `CPF_CNPJ`, `OBSERVACAO`) VALUES
(1, 'BALCAO', 'RUA 1', 'CENTRO', 1, 11, '000', '0000000000', '000.000.000-00', 'teste da observação'),
(2, 'JOÃO ALFREDO DA SILVA', 'RUA: PEDRO BOTARO, 100', 'CENTRO', 1, 11, '36500-000', '(32) 3531-9999', '000.000.000-00', 'testando 1'),
(3, 'MARIA DA SILVA FREITAS', 'RUA: MATIAS BARBOSA, 35', 'SANTANA', 2, 11, '36750-000', '(32)3531-0000', '000.000.000-00', 'obra 2'),
(4, 'FERNANDO DA SILVA', 'RUA: DEODORO, 222', 'CENTRO', 1, 11, '36500-000', '323531-0000', '000.000.000-00', 'obra 3');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas_pagar`
--

CREATE TABLE IF NOT EXISTS `contas_pagar` (
  `PK_CODIGO` int(10) NOT NULL,
  `FK_CODIGO_PESSOA` int(10) NOT NULL,
  `DESCRICAO` varchar(500) NOT NULL,
  `DATA` date NOT NULL,
  `VENCIMENTO` date NOT NULL,
  `FK_TIPO_PAGAMENTO` int(11) NOT NULL,
  `OBSERVACAO` varchar(500) NOT NULL,
  `SITUACAO` smallint(1) NOT NULL,
  `VALOR` float NOT NULL,
  `PAGAMENTO` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `contas_pagar`
--

INSERT INTO `contas_pagar` (`PK_CODIGO`, `FK_CODIGO_PESSOA`, `DESCRICAO`, `DATA`, `VENCIMENTO`, `FK_TIPO_PAGAMENTO`, `OBSERVACAO`, `SITUACAO`, `VALOR`, `PAGAMENTO`) VALUES
(1, 1, 'conta de luz', '2014-10-16', '2014-10-16', 1, '', 1, 50, '2014-10-16'),
(2, 1, 'suporte remoto', '2014-10-16', '2014-10-16', 1, 'teste', 1, 250, '2014-10-16'),
(3, 1, 'CONTA TELEFONE FIXO', '2014-10-17', '2014-10-17', 1, 'teste', 0, 28.9, '2014-10-17'),
(4, 1, 'conta teste', '2015-03-03', '2015-03-03', 1, '', 1, 150, '2015-03-03'),
(5, 1, 'CONTA TESTE 2', '2015-03-03', '2015-03-03', 1, '', 0, 325, '2015-03-03');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas_receber`
--

CREATE TABLE IF NOT EXISTS `contas_receber` (
  `PK_CODIGO` int(10) NOT NULL,
  `FK_CODIGO_PESSOA` int(10) NOT NULL,
  `DESCRICAO` varchar(500) NOT NULL,
  `DATA` date NOT NULL,
  `VENCIMENTO` date NOT NULL,
  `FK_TIPO_PAGAMENTO` int(11) NOT NULL,
  `OBSERVACAO` varchar(500) NOT NULL,
  `SITUACAO` smallint(1) NOT NULL,
  `VALOR` float NOT NULL,
  `PAGAMENTO` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `contas_receber`
--

INSERT INTO `contas_receber` (`PK_CODIGO`, `FK_CODIGO_PESSOA`, `DESCRICAO`, `DATA`, `VENCIMENTO`, `FK_TIPO_PAGAMENTO`, `OBSERVACAO`, `SITUACAO`, `VALOR`, `PAGAMENTO`) VALUES
(1, 3, 'FORMATAÇÃO COMPUTADOR', '2014-10-16', '2014-10-16', 1, '', 1, 90, '2014-10-16'),
(2, 1, 'PLACA DE VIDEO', '2014-10-16', '2014-10-16', 1, '', 1, 230, '2014-10-16'),
(3, 2, 'MOUSE USB SEM FIO', '2014-10-16', '2014-10-16', 1, '', 1, 21.9, '2014-10-16'),
(4, 1, 'conta celular', '2014-10-17', '2014-10-17', 1, 'teste da obs', 0, 180, '2014-10-17');

-- --------------------------------------------------------

--
-- Estrutura da tabela `delivery`
--

CREATE TABLE IF NOT EXISTS `delivery` (
  `pk_codigo` int(11) NOT NULL,
  `fk_codigo_cliente` int(11) NOT NULL,
  `situacao` varchar(45) NOT NULL,
  `codigo_telefone` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE IF NOT EXISTS `empresa` (
  `CODIGO` int(10) unsigned NOT NULL,
  `RAZAO_SOCIAL` varchar(300) NOT NULL,
  `NOME_FANTASIA` varchar(300) NOT NULL,
  `ENDERECO` varchar(300) NOT NULL,
  `BAIRRO` varchar(300) NOT NULL,
  `COD_CIDADE` int(10) unsigned NOT NULL,
  `COD_ESTADO` int(10) unsigned NOT NULL,
  `CEP` varchar(30) NOT NULL,
  `TELEFONE` varchar(30) NOT NULL,
  `CNPJ` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `empresa`
--

INSERT INTO `empresa` (`CODIGO`, `RAZAO_SOCIAL`, `NOME_FANTASIA`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`, `CNPJ`) VALUES
(1, 'PEG E PAGA DO JOSE DIAS ME', 'PEG E PAGA DO JOSE DIAS', 'RUA: 15 DE NOVEMBRO, 111', 'CENTRO', 1, 11, '36500-000', '(32)3531-0000', '000.000/0001-09');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `codigo` int(11) NOT NULL,
  `uf` varchar(2) CHARACTER SET utf8 NOT NULL,
  `nome` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estado`
--

INSERT INTO `estado` (`codigo`, `uf`, `nome`) VALUES
(1, 'AC', 'Acre'),
(2, 'AL', 'Alagoas'),
(3, 'AM', 'Amazonas'),
(4, 'AP', 'Amapá'),
(5, 'BA', 'Bahia'),
(6, 'CE', 'Ceará'),
(7, 'DF', 'Distrito Federal'),
(8, 'ES', 'Espírito Santo'),
(9, 'GO', 'Goiás'),
(10, 'MA', 'Maranhão'),
(11, 'MG', 'Minas Gerais'),
(12, 'MS', 'Mato Grosso do Sul'),
(13, 'MT', 'Mato Grosso'),
(14, 'PA', 'Pará'),
(15, 'PB', 'Paraíba'),
(16, 'PE', 'Pernambuco'),
(17, 'PI', 'Piauí'),
(18, 'PR', 'Paraná'),
(19, 'RJ', 'Rio de Janeiro'),
(20, 'RN', 'Rio Grande do Norte'),
(21, 'RO', 'Rondônia'),
(22, 'RR', 'Roraima'),
(23, 'RS', 'Rio Grande do Sul'),
(24, 'SC', 'Santa Catarina'),
(25, 'SE', 'Sergipe'),
(26, 'SP', 'São Paulo'),
(27, 'TO', 'Tocantins');

-- --------------------------------------------------------

--
-- Estrutura da tabela `forma_pagamento`
--

CREATE TABLE IF NOT EXISTS `forma_pagamento` (
  `codigo` int(10) unsigned NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `desconto` float NOT NULL,
  `quantidade_parcelas` int(11) NOT NULL,
  `observacao` varchar(300) CHARACTER SET utf8 NOT NULL,
  `situacao` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `forma_pagamento`
--

INSERT INTO `forma_pagamento` (`codigo`, `descricao`, `desconto`, `quantidade_parcelas`, `observacao`, `situacao`) VALUES
(1, 'A VISTA', 0, 0, 'PAGAMENTO A VISTA', 1),
(2, 'CARTÃO 30/60 DIAS', 0, 0, '', 1),
(3, 'CARTÃO 30/60/90 DIAS', 0, 0, '', 1),
(4, 'CARTÃO 30/60/90/120 DIAS', 0, 0, '', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE IF NOT EXISTS `fornecedores` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `COD_CIDADE` int(11) DEFAULT NULL,
  `COD_ESTADO` int(11) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`) VALUES
(1, 'FD FORNECEDORES LTDA', 'RUA 2', 'CENTRO 2', 1, 11, '234', '234234'),
(2, 'ENERGISA MG DISTRIBUIDORA DE ENERGIA SA', 'centro', 'rua das neves, 000', 2, 11, '36500-000', '(32)3531-0000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `garcon`
--

CREATE TABLE IF NOT EXISTS `garcon` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `COD_CIDADE` int(11) DEFAULT NULL,
  `COD_ESTADO` int(11) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL,
  `COMISSAO` float NOT NULL,
  `senha` varchar(255) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `garcon`
--

INSERT INTO `garcon` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`, `COMISSAO`, `senha`) VALUES
(1, 'JUVENILDO BATISTA DA SILVA', 'rua das flores, 255', 'santana', 1, 11, '36500-000', '(32)3531-0001', 5, '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_pedidos_delivery`
--

CREATE TABLE IF NOT EXISTS `itens_pedidos_delivery` (
  `pk_codigo` int(11) NOT NULL,
  `codigo_telefone` varchar(30) CHARACTER SET utf8 NOT NULL,
  `fk_codigo_produto` int(11) NOT NULL,
  `observacao` varchar(300) CHARACTER SET utf8 NOT NULL,
  `quantidade` float NOT NULL,
  `status_pedido` varchar(45) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_pedido_mesa`
--

CREATE TABLE IF NOT EXISTS `itens_pedido_mesa` (
  `pk_codigo` int(10) unsigned NOT NULL,
  `fk_codigo_mesa` int(10) unsigned NOT NULL,
  `fk_codigo_produto` int(10) unsigned NOT NULL,
  `status_pedido` varchar(30) NOT NULL,
  `observacao` varchar(100) NOT NULL,
  `quantidade` float NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `itens_pedido_mesa`
--

INSERT INTO `itens_pedido_mesa` (`pk_codigo`, `fk_codigo_mesa`, `fk_codigo_produto`, `status_pedido`, `observacao`, `quantidade`) VALUES
(29, 5, 3, 'Em Pedido', '3', 1),
(30, 12, 4, 'Em Pedido', '', 1),
(31, 12, 1, 'Em Pedido', '', 1),
(32, 15, 2, 'Em aberto', 'çlkçlkjlçkjçlk', 1),
(33, 15, 9, 'Em aberto', 'SEM AMARELAS', 66);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mesas`
--

CREATE TABLE IF NOT EXISTS `mesas` (
  `pk_codigo` int(10) unsigned NOT NULL,
  `numero_mesa` varchar(45) NOT NULL,
  `situacao_mesa` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `mesas`
--

INSERT INTO `mesas` (`pk_codigo`, `numero_mesa`, `situacao_mesa`) VALUES
(1, '1', 'livre'),
(2, '2', 'livre'),
(3, '3', 'livre'),
(4, '4', 'livre'),
(5, '5', 'ocupada'),
(6, '6', 'livre'),
(7, '7', 'livre'),
(8, '8', 'livre'),
(9, '9', 'livre'),
(10, '10', 'livre'),
(11, '11', 'livre'),
(12, '12', 'ocupada'),
(13, '13', 'livre'),
(14, '14', 'livre'),
(15, '15', 'aberto'),
(16, '16', 'livre'),
(17, '17', 'livre'),
(18, '18', 'livre'),
(19, '19', 'livre'),
(20, '20', 'livre'),
(21, '21', 'livre'),
(22, '22', 'livre'),
(23, '23', 'livre'),
(24, '24', 'livre'),
(25, '25', 'livre'),
(26, '26', 'livre'),
(27, '27', 'livre'),
(28, '28', 'livre'),
(29, '29', 'livre'),
(30, '30', 'livre'),
(31, '31', 'livre'),
(32, '32', 'livre'),
(33, '33', 'livre'),
(34, '34', 'livre'),
(35, '35', 'livre'),
(36, '36', 'livre'),
(37, '37', 'livre'),
(38, '38', 'livre'),
(39, '39', 'livre'),
(40, '40', 'livre'),
(41, '41', 'livre'),
(42, '42', 'livre'),
(43, '43', 'livre'),
(44, '44', 'livre'),
(45, '45', 'livre'),
(46, '46', 'livre'),
(47, '47', 'livre'),
(48, '48', 'livre'),
(49, '49', 'livre'),
(50, '50', 'livre');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
  `CODIGO` int(11) NOT NULL,
  `FORNECEDORES_CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `DESCRICAO` text,
  `VALOR` double DEFAULT NULL,
  `ESTOQUE` float DEFAULT NULL,
  `CODIGO_BARRAS` varchar(100) DEFAULT '0',
  `UNIDADE_MEDIDA` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`CODIGO`, `FORNECEDORES_CODIGO`, `NOME`, `DESCRICAO`, `VALOR`, `ESTOQUE`, `CODIGO_BARRAS`, `UNIDADE_MEDIDA`) VALUES
(1, 1, 'HAMBURGUER', '', 3.5, 2, '1', 5),
(2, 1, 'X SALADA', '', 3.5, 1, '2', 5),
(3, 1, 'X BACON', '', 4, 0, '3', 5),
(4, 1, 'BIG BURGER', '', 6.4, 4, '4', 5),
(5, 1, 'X FRANGO', '', 5.8, 5, '5', 5),
(6, 1, 'X TUDO', '', 12, 11, '6', 5),
(7, 1, 'SUCO DE UVA TIAL 1L', '', 1.99, 2, '7', 4),
(8, 1, 'COCA COLA 2L', '', 6.8, 3, '8', 4),
(9, 1, 'JUJUBA', '', 2.5, 99, 'ASDF', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuarios`
--

CREATE TABLE IF NOT EXISTS `tbl_usuarios` (
  `pk_codigo` int(10) unsigned NOT NULL,
  `nome` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbl_usuarios`
--

INSERT INTO `tbl_usuarios` (`pk_codigo`, `nome`, `login`, `senha`) VALUES
(1, 'ADMINISTRADOR', 'admin', '123'),
(3, 'ANA CAROLINA', 'ana', ''),
(4, 'teste', '123', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `total_mesas`
--

CREATE TABLE IF NOT EXISTS `total_mesas` (
  `pk_codigo` int(10) unsigned NOT NULL,
  `quantidade` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `total_mesas`
--

INSERT INTO `total_mesas` (`pk_codigo`, `quantidade`) VALUES
(1, 20);

-- --------------------------------------------------------

--
-- Estrutura da tabela `unidade_medida`
--

CREATE TABLE IF NOT EXISTS `unidade_medida` (
  `codigo` bigint(20) unsigned NOT NULL,
  `abreviacao` varchar(5) CHARACTER SET utf8 DEFAULT NULL,
  `descricao` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `unidade_medida`
--

INSERT INTO `unidade_medida` (`codigo`, `abreviacao`, `descricao`) VALUES
(1, 'KG', 'Quilograma'),
(2, 'G', 'Grama'),
(4, 'L', 'Litro'),
(5, 'UN', 'Unidade');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario_permissao`
--

CREATE TABLE IF NOT EXISTS `usuario_permissao` (
  `pk_codigo` int(10) unsigned NOT NULL,
  `fk_codigo_usuario` int(10) unsigned NOT NULL,
  `permissao` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario_permissao`
--

INSERT INTO `usuario_permissao` (`pk_codigo`, `fk_codigo_usuario`, `permissao`) VALUES
(32, 0, 'null'),
(72, 3, 'cliente'),
(73, 3, 'produto'),
(74, 3, 'venda'),
(75, 3, 'pdv'),
(111, 1, 'cliente'),
(112, 1, 'produto'),
(113, 1, 'fornecedor'),
(114, 1, 'usuario'),
(115, 1, 'venda'),
(116, 1, 'pagar'),
(117, 1, 'receber'),
(118, 1, 'empresa'),
(119, 1, 'fornecedor'),
(120, 1, 'cidade'),
(121, 1, 'unidade'),
(122, 1, 'pagamento'),
(123, 1, 'orcamento'),
(124, 1, 'caixa'),
(125, 4, 'cliente'),
(126, 4, 'produto'),
(127, 4, 'usuario'),
(128, 4, 'venda'),
(129, 4, 'pagar'),
(130, 4, 'receber'),
(131, 4, 'empresa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE IF NOT EXISTS `vendas` (
  `CODIGO` int(11) NOT NULL,
  `CLIENTES_CODIGO` int(11) NOT NULL,
  `DATA_VENDA` date DEFAULT NULL,
  `VALOR_TOTAL` float DEFAULT NULL,
  `DESCONTO` float DEFAULT NULL,
  `TIPO_PAGAMENTO` int(10) unsigned DEFAULT '1',
  `TIPO` tinyint(1) NOT NULL,
  `OBSERVACAO` varchar(2000) CHARACTER SET utf8 NOT NULL DEFAULT ' '
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`CODIGO`, `CLIENTES_CODIGO`, `DATA_VENDA`, `VALOR_TOTAL`, `DESCONTO`, `TIPO_PAGAMENTO`, `TIPO`, `OBSERVACAO`) VALUES
(113, 1, '2015-07-16', 16.8, 0, 1, 1, 'null'),
(115, 1, '2015-07-16', 15.5, 0, 1, 1, 'null');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_produto`
--

CREATE TABLE IF NOT EXISTS `vendas_produto` (
  `CODIGO` int(11) NOT NULL,
  `CODIGO_PRODUTO` int(11) DEFAULT NULL,
  `CODIGO_VENDA` int(11) DEFAULT NULL,
  `QUANTIDADE` float DEFAULT NULL,
  `VALOR_UNITARIO` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=339 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendas_produto`
--

INSERT INTO `vendas_produto` (`CODIGO`, `CODIGO_PRODUTO`, `CODIGO_VENDA`, `QUANTIDADE`, `VALOR_UNITARIO`) VALUES
(335, 3, 113, 1, 4),
(336, 4, 113, 2, 6.4),
(337, 2, 115, 1, 3.5),
(338, 6, 115, 1, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caixa`
--
ALTER TABLE `caixa`
  ADD PRIMARY KEY (`CODIGO`) USING BTREE;

--
-- Indexes for table `cidade`
--
ALTER TABLE `cidade`
  ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`), ADD KEY `FK_cidades_1` (`fk_cod_estado`);

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `contas_pagar`
--
ALTER TABLE `contas_pagar`
  ADD PRIMARY KEY (`PK_CODIGO`);

--
-- Indexes for table `contas_receber`
--
ALTER TABLE `contas_receber`
  ADD PRIMARY KEY (`PK_CODIGO`);

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `forma_pagamento`
--
ALTER TABLE `forma_pagamento`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `garcon`
--
ALTER TABLE `garcon`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `itens_pedidos_delivery`
--
ALTER TABLE `itens_pedidos_delivery`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `itens_pedido_mesa`
--
ALTER TABLE `itens_pedido_mesa`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `mesas`
--
ALTER TABLE `mesas`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`CODIGO`), ADD KEY `FK_produtos_1` (`FORNECEDORES_CODIGO`);

--
-- Indexes for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `total_mesas`
--
ALTER TABLE `total_mesas`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `unidade_medida`
--
ALTER TABLE `unidade_medida`
  ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indexes for table `usuario_permissao`
--
ALTER TABLE `usuario_permissao`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`CODIGO`), ADD KEY `FK_vendas_1` (`CLIENTES_CODIGO`);

--
-- Indexes for table `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD PRIMARY KEY (`CODIGO`), ADD KEY `FK_vendas_produto_1` (`CODIGO_PRODUTO`), ADD KEY `FK_vendas_produto_2` (`CODIGO_VENDA`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caixa`
--
ALTER TABLE `caixa`
  MODIFY `CODIGO` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cidade`
--
ALTER TABLE `cidade`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `contas_pagar`
--
ALTER TABLE `contas_pagar`
  MODIFY `PK_CODIGO` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `contas_receber`
--
ALTER TABLE `contas_receber`
  MODIFY `PK_CODIGO` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `delivery`
--
ALTER TABLE `delivery`
  MODIFY `pk_codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `empresa`
--
ALTER TABLE `empresa`
  MODIFY `CODIGO` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `estado`
--
ALTER TABLE `estado`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `forma_pagamento`
--
ALTER TABLE `forma_pagamento`
  MODIFY `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `garcon`
--
ALTER TABLE `garcon`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `itens_pedidos_delivery`
--
ALTER TABLE `itens_pedidos_delivery`
  MODIFY `pk_codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `itens_pedido_mesa`
--
ALTER TABLE `itens_pedido_mesa`
  MODIFY `pk_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `mesas`
--
ALTER TABLE `mesas`
  MODIFY `pk_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=51;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  MODIFY `pk_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `unidade_medida`
--
ALTER TABLE `unidade_medida`
  MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `usuario_permissao`
--
ALTER TABLE `usuario_permissao`
  MODIFY `pk_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=132;
--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=116;
--
-- AUTO_INCREMENT for table `vendas_produto`
--
ALTER TABLE `vendas_produto`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=339;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
