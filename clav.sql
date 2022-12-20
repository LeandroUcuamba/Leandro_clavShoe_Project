-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12-Out-2022 às 20:04
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clav`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `id_cliente` int(11) NOT NULL,
  `nomeCliente` varchar(100) NOT NULL,
  `telefoneCliente` varchar(30) DEFAULT NULL,
  `nifCliente` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`id_cliente`, `nomeCliente`, `telefoneCliente`, `nifCliente`) VALUES
(1, 'leandro', '98766432', '833829'),
(9, 'tiago', '765676', '99999987'),
(11, 'Vanilson Banza', '676', 'lllakshdj4638'),
(12, 'Francisco', '945674834', 'g5j5g4h656ggg');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_fornecedor`
--

CREATE TABLE `tbl_fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nomeFor` varchar(100) NOT NULL,
  `nifFor` varchar(30) NOT NULL,
  `enderecoFor` varchar(30) NOT NULL,
  `telefone` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_fornecedor`
--

INSERT INTO `tbl_fornecedor` (`id_fornecedor`, `nomeFor`, `nifFor`, `enderecoFor`, `telefone`) VALUES
(1, 'Cashi LDA', '34445654', 'Luanda', '9453674835');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_funcionario`
--

CREATE TABLE `tbl_funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `nomeFun` varchar(100) NOT NULL,
  `telefoneFun` varchar(30) NOT NULL,
  `cargoFun` varchar(30) NOT NULL,
  `dataNascimento` date NOT NULL,
  `morada` varchar(30) NOT NULL,
  `sexo` varchar(30) NOT NULL,
  `nBI` varchar(30) NOT NULL,
  `usuarioLogin` varchar(30) NOT NULL,
  `senhaLogin` varchar(30) NOT NULL,
  `nifLoja` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_funcionario`
--

INSERT INTO `tbl_funcionario` (`id_funcionario`, `nomeFun`, `telefoneFun`, `cargoFun`, `dataNascimento`, `morada`, `sexo`, `nBI`, `usuarioLogin`, `senhaLogin`, `nifLoja`) VALUES
(2, 'leandro', '944444444', 'Administrador', '2021-05-10', 'golf', 'M', '87656789hghdjs2222', 'leandrok', 'leandro123', 'CLAV000'),
(3, 'Celso', '945676876', 'Comum', '2021-05-11', 'nova-vida', 'M', 'sdfds3443567rfghgtfr', 'celsoCoutinho', 'celso45', 'CLAV000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_loja`
--

CREATE TABLE `tbl_loja` (
  `nifLoja` varchar(30) NOT NULL,
  `nomeLoja` varchar(100) NOT NULL,
  `localizacao` varchar(30) NOT NULL,
  `bairro` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_loja`
--

INSERT INTO `tbl_loja` (`nifLoja`, `nomeLoja`, `localizacao`, `bairro`) VALUES
('CLAV000', 'CLAV', 'Huambo', 'MORRO-BENTO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produto`
--

CREATE TABLE `tbl_produto` (
  `id_produto` int(11) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `tamanho` varchar(30) NOT NULL,
  `preco` double NOT NULL,
  `categoria` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_produto`
--

INSERT INTO `tbl_produto` (`id_produto`, `marca`, `modelo`, `tamanho`, `preco`, `categoria`) VALUES
(1, 'Adidas', 'Stan Smith', '40,41,43', 170, 'Tenis'),
(2, 'Nike', 'vk', '39,41', 270, 'tenis'),
(3, 'adidas', 'lubber', '40,42', 195, 'tenis');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produtofornecedor`
--

CREATE TABLE `tbl_produtofornecedor` (
  `id_produtoFor` int(11) NOT NULL,
  `descricao` varchar(30) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `dataHoraFor` datetime NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `nifLoja` varchar(30) NOT NULL,
  `id_produto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_produtofornecedor`
--

INSERT INTO `tbl_produtofornecedor` (`id_produtoFor`, `descricao`, `quantidade`, `dataHoraFor`, `id_fornecedor`, `nifLoja`, `id_produto`) VALUES
(1, '', 20, '2021-05-27 00:00:00', 1, 'CLAV000', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_venda`
--

CREATE TABLE `tbl_venda` (
  `id_venda` int(11) NOT NULL,
  `dataVenda` datetime NOT NULL,
  `id_funcionario` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_venda`
--

INSERT INTO `tbl_venda` (`id_venda`, `dataVenda`, `id_funcionario`, `id_cliente`) VALUES
(5, '2021-06-04 00:00:00', 3, 11),
(8, '2021-06-08 00:00:00', 2, 9);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_vendaproduto`
--

CREATE TABLE `tbl_vendaproduto` (
  `id_vendaProduto` int(11) NOT NULL,
  `valorProduto` double NOT NULL,
  `unidadeProduto` int(11) NOT NULL,
  `valorPagar` double DEFAULT NULL,
  `valorTotalCompra` double NOT NULL,
  `valorTroco` double DEFAULT NULL,
  `id_venda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices para tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD KEY `fk_nifLoja` (`nifLoja`);

--
-- Índices para tabela `tbl_loja`
--
ALTER TABLE `tbl_loja`
  ADD PRIMARY KEY (`nifLoja`);

--
-- Índices para tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  ADD PRIMARY KEY (`id_produto`);

--
-- Índices para tabela `tbl_produtofornecedor`
--
ALTER TABLE `tbl_produtofornecedor`
  ADD PRIMARY KEY (`id_produtoFor`),
  ADD KEY `fk_id_produto` (`id_produto`),
  ADD KEY `fk_id_fornecedor` (`id_fornecedor`),
  ADD KEY `fk_nifLoja` (`nifLoja`);

--
-- Índices para tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `fk_id_funcionario` (`id_funcionario`),
  ADD KEY `fk_id_cliente` (`id_cliente`);

--
-- Índices para tabela `tbl_vendaproduto`
--
ALTER TABLE `tbl_vendaproduto`
  ADD PRIMARY KEY (`id_vendaProduto`),
  ADD KEY `fk_id_venda` (`id_venda`),
  ADD KEY `fk_id_produto` (`id_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tbl_produtofornecedor`
--
ALTER TABLE `tbl_produtofornecedor`
  MODIFY `id_produtoFor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `tbl_vendaproduto`
--
ALTER TABLE `tbl_vendaproduto`
  MODIFY `id_vendaProduto` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  ADD CONSTRAINT `nifLoja` FOREIGN KEY (`nifLoja`) REFERENCES `tbl_loja` (`nifLoja`);

--
-- Limitadores para a tabela `tbl_produtofornecedor`
--
ALTER TABLE `tbl_produtofornecedor`
  ADD CONSTRAINT `id_fornecedor` FOREIGN KEY (`id_fornecedor`) REFERENCES `tbl_fornecedor` (`id_fornecedor`),
  ADD CONSTRAINT `id_produto` FOREIGN KEY (`id_produto`) REFERENCES `tbl_produto` (`id_produto`),
  ADD CONSTRAINT `nifLojad` FOREIGN KEY (`nifLoja`) REFERENCES `tbl_loja` (`nifLoja`);

--
-- Limitadores para a tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  ADD CONSTRAINT `id_clien` FOREIGN KEY (`id_cliente`) REFERENCES `tbl_cliente` (`id_cliente`),
  ADD CONSTRAINT `id_fun` FOREIGN KEY (`id_funcionario`) REFERENCES `tbl_funcionario` (`id_funcionario`);

--
-- Limitadores para a tabela `tbl_vendaproduto`
--
ALTER TABLE `tbl_vendaproduto`
  ADD CONSTRAINT `hh` FOREIGN KEY (`id_venda`) REFERENCES `tbl_venda` (`id_venda`),
  ADD CONSTRAINT `hhh` FOREIGN KEY (`id_produto`) REFERENCES `tbl_produto` (`id_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
