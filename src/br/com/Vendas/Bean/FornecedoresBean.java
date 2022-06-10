package br.com.Vendas.Bean;





import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import br.com.Vendas.domain.Fornecedor;
import br.com.Vendas.util.JSFUtil;

@ManagedBean(name = "MBFornecedores")
@ViewScoped
public class FornecedoresBean {
	
	private Fornecedor fornecedores;
//	private ArrayList<Fornecedor>itens;
//	private ArrayList<Fornecedor>itensFiltrados;
//	
//
//	public Fornecedor getFornecedores() {
//		return fornecedores;
//	}
//
//	public void setFornecedor(Fornecedores fornecedores) {
//		this.fornecedores = fornecedores;
//	}
//	public ArrayList<Fornecedores> getItens() {
//		return itens;
//	}
//	
//     public void setItens(ArrayList<Fornecedores> itens) {
//	this.itens = itens;
//   }
//    
//     public ArrayList<Fornecedores> getItensFiltrados() {
//		return itensFiltrados;
//	}
//     public void setItensFiltrados(ArrayList<Fornecedores> itensFiltrados) {
//		this.itensFiltrados = itensFiltrados;
//	}
//	
	
//	public void prepararNovo(){
//		fornecedores = new Fornecedor();
//	}
	
	public void salvar(){
		
//		  try {
//			FornecedoresDAO fdao= new FornecedoresDAO();
//			fdao.salvar(fornecedores);
			
			JSFUtil.adicionarMensagemSucesso("Fornecedor salvo com sucesso!");
//			
//		} catch (SQLException e) {
//			JSFUtil.adicionarMensagemErro("ex.getMessage()");
//			e.printStackTrace();
//		}
		  
	
//	public void novo(){
//		
//		 try {
//			 FornecedoresDAO fdao= new FornecedoresDAO();
//			 fdao.salvar(fornecedores);
//			 
//			 itens = fdao.listar();
//			 
//			 JSFUtil.adicionarMensagemSucesso("Fornecedor salvo com sucesso!");
//			} catch (SQLException e) {
//				JSFUtil.adicionarMensagemErro("ex.getMessage()");
//				e.printStackTrace();
//			}
//	}
//	
//    public void excluir(){
//		
//    	try {
//			FornecedoresDAO fdao = new FornecedoresDAO();
//			 fdao.excluir(fornecedores);
//			 
//			 itens = fdao.listar();	 
//			 
//			 JSFUtil.adicionarMensagemSucesso("Fornecedor excluido com sucesso!");
//			} 
//    	catch (SQLException e) {
//				JSFUtil.adicionarMensagemErro("Não é possível excluir fornecedor que tenha um produto associado!");
//				e.printStackTrace();
//			}
//    }
//    	
//    
//        public void editar(){
//    		
//        	try {
//    			 FornecedoresDAO fdao= new FornecedoresDAO();
//    			 fdao.editar(fornecedores);
//    			 
//    			 itens = fdao.listar();    			
//    			 
//    			 JSFUtil.adicionarMensagemSucesso("Fornecedor editado com sucesso!");
//    			 
//    			} catch (SQLException e) {
//    				JSFUtil.adicionarMensagemErro("ex.getMessage()");
//    				e.printStackTrace();
//    			}
//    	}
	}
}
