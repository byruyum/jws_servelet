<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>    

<%! String greeting = "꾸팡.COM에 오신것을 환영합니다.";
	String tagline = "하단 페이지 : 확인";%>
<div class="container">
	<div class="jumbotron">
		<div class="container">
			<h3 class="display-4">
				<%=greeting%>
            </h3>
		</div>
	</div>
<%
	ArrayList<Product> listOfProducts = productDAO.getAllProducts(); // 리스트에 상품 전체 정보를 얻어온다.
%> 	
    
<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>

<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
                <div class="card bg-dark text-white">
                        <img src="../image/product/<%=product.getProductId()%>.jpg" class="card-img" alt="...">
                        <div class="card-img-overlay">
                        <p class="card-text">출처 : 구글 검색</p>
                        </div>
                        </div>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
                <p><a href="product_detail_ad.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>
			</div>
			<%
				}
			%>
		</div>
		<hr>
</div>
	    <div class="jumbotron">
		    <div class="container">
			    <h1 class="display-3">
				    <%=greeting%>
			    </h1>
		    </div>
	    </div>	
	<div class="card bg-dark text-white">
        <img src="image/jaguar.jpg" class="card-img" alt="...">
        <div class="card-img-overlay">
        <h5 class="card-title">재규어</h5>
        <p class="card-text">출처 : 구글</p>
    </div>
</div>
    <div class="list-group">
      <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
        재규어
      </a>
      <a href="#" class="list-group-item list-group-item-action" aria-current="true">
        호랑이
      </a>  
      <a href="#" class="list-group-item list-group-item-action" aria-current="true">
        사자
      </a>  
      <a href="#" class="list-group-item list-group-item-action" aria-current="true">
        먹이
      </a>  
    </div>