package br.com.Vendas.tes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.DAO.FuncionariosDAO;
import br.com.Vendas.DAO.VendasDAO;
import br.com.Vendas.domain.Funcionario;
import br.com.Vendas.domain.Venda;

public class VendaDAOTest {

	@Test
	@Ignore
	public void salvar() {

		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario funcionario = dao.buscarPorCodigo(1L);
		Venda v1 = new Venda();

		v1.setHorario(new Date());
		v1.setValor_total(new BigDecimal(2150.00D));
		v1.setFuncionario(funcionario);

		VendasDAO vendasdao = new VendasDAO();
		vendasdao.salvar(v1);

	}

	@Test
	@Ignore
	public void listar() {
		VendasDAO dao = new VendasDAO();
		List<Venda> lista = dao.listar();

		for (Venda venda : lista) {
			System.out.println(venda);
		}
	}

	@Test
	@Ignore
	
	public void buscarPorCodigo() {
		VendasDAO dao = new VendasDAO();

		Venda v1 = dao.buscarPorCodigo(3L);

		System.out.println(v1);

	}

	@Test
	@Ignore
	public void excluir() {
		VendasDAO dao = new VendasDAO();

		Venda venda = dao.buscarPorCodigo(2L);

		dao.excluir(venda);

	}

	@Test

	public void editar() {

		FuncionariosDAO fdao = new FuncionariosDAO();
		Funcionario funcionario = fdao.buscarPorCodigo(4L);

		VendasDAO dao = new VendasDAO();
		Venda v1 = dao.buscarPorCodigo(1L);
		
		v1.setHorario(new Date());
		v1.setValor_total(new BigDecimal(730));
		v1.setFuncionario(funcionario);
		

		dao.editar(v1);

	}

}
