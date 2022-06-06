package br.com.Vendas.tes;

import java.math.BigDecimal;

import java.util.List;


import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.DAO.FornecedoresDAO;

import br.com.Vendas.DAO.ProdutosDAO;
import br.com.Vendas.domain.Fornecedor;

import br.com.Vendas.domain.Produto;


public class ProdutoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor fornecedor = dao.buscarPorCodigo(3L);
		Produto p1 = new Produto();
		
		p1.setDescricao("cimento");
		p1.setPreco(new BigDecimal(71.99D));
		p1.setQuantidade(12);
		p1.setFornecedor(fornecedor);
		

		ProdutosDAO produtosdao = new ProdutosDAO();
		produtosdao.salvar(p1);
		

	}
	@Test
	@Ignore
	public void listar(){
	ProdutosDAO dao = new ProdutosDAO();
	List<Produto> lista = dao.listar();

	for (Produto produto : lista) {
		System.out.println(produto);
	}
}
	@Test
	@Ignore
	public void buscarPorCodigo() {
		ProdutosDAO dao = new ProdutosDAO();

		Produto p1 = dao.buscarPorCodigo(1L);
		

		System.out.println(p1);
		

	}

	@Test
	@Ignore
	public void excluir() {
		ProdutosDAO dao = new ProdutosDAO();

		Produto produto = dao.buscarPorCodigo(2L);
		
		dao.excluir(produto);

	}
	
	@Test
	
	public void editar() {

		FornecedoresDAO fdao = new FornecedoresDAO();
		Fornecedor fornecedor = fdao.buscarPorCodigo(9L);
		
		ProdutosDAO produtodao = new ProdutosDAO();
		
		Produto produto = produtodao.buscarPorCodigo(3L);

		produto.setDescricao("cimento");
		produto.setPreco(new BigDecimal(87.99));
		produto.setQuantidade(5);
		produto.setFornecedor(fornecedor);
		
		
		
		produtodao.editar(produto);

	}
		
}
