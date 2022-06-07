package br.com.Vendas.tes;

import java.math.BigDecimal;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;


import br.com.Vendas.DAO.ItemDAO;
import br.com.Vendas.DAO.ProdutosDAO;
import br.com.Vendas.DAO.VendasDAO;

import br.com.Vendas.domain.Item;
import br.com.Vendas.domain.Produto;
import br.com.Vendas.domain.Venda;

public class ItemDAOTest {

	@Test
	@Ignore
	
	public void salvar() {

		ProdutosDAO pdao = new ProdutosDAO();
		Produto produto = pdao.buscarPorCodigo(5L);
		
		VendasDAO vdao = new VendasDAO();
		Venda venda = vdao.buscarPorCodigo(3L);	
				
		Item i1 = new Item();
		
		i1.setQuantidade(32);
		i1.setValor_parcial(new BigDecimal(420.00D));
		i1.setProduto(produto);
		i1.setVenda(venda);	

		ItemDAO itensdao = new ItemDAO();
		itensdao.salvar(i1);

	}

	@Test
	@Ignore
	
	public void listar() {
		ItemDAO dao = new ItemDAO();
		List<Item> lista = dao.listar();

		for (Item item : lista) {
			System.out.println(item);
		}
	}

	@Test
	@Ignore
	
	public void buscarPorCodigo() {
		ItemDAO dao = new ItemDAO();

		Item i1 = dao.buscarPorCodigo(4L);

		System.out.println(i1);

	}

	@Test
	@Ignore
	
	public void excluir() {
		ItemDAO dao = new ItemDAO();

		Item item = dao.buscarPorCodigo(2L);

		dao.excluir(item);

	}

	@Test
    
	public void editar() {

		VendasDAO vdao = new VendasDAO();
		Venda venda = vdao.buscarPorCodigo(3L);

		ProdutosDAO pdao = new ProdutosDAO();
		Produto produto  = pdao.buscarPorCodigo(5L);
		
		ItemDAO dao = new ItemDAO();
		Item i1 = dao.buscarPorCodigo(1L);
		
		i1.setQuantidade(13);
		i1.setValor_parcial(new BigDecimal(80.20));
		i1.setVenda(venda);
		i1.setProduto(produto);
		

		dao.editar(i1);

	}

}
