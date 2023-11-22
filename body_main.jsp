<%@ page contentType = "text/html;charset=utf-8" %>
<%! String greeting = "꾸팡.COM에 오신것을 환영합니다.";
	String tagline = "하단 페이지 : 확인";%>
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
        치타
      </a>  
      <a href="#" class="list-group-item list-group-item-action" aria-current="true">
        표범
      </a>
    </div>