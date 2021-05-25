
<template>

  <div class="headerbar">
		<b-navbar toggleable="lg" type="light" variant="light">
			<b-navbar-brand href="/">
				<img src = "../../assets/logo.png" width="40px" height="40px">
			</b-navbar-brand>

			<b-collapse  id="nav-collapse" is-nav>
				
				<!-- Right aligned nav items -->
				<b-navbar-nav class="ms-auto">
					<b-nav-item href="/announcement">공지사항</b-nav-item>
					<b-nav-item href="/QnAlist">Q&A</b-nav-item>
					<b-nav-item href="/board"> 게시판</b-nav-item>
					<b-nav-item href="/login"> 로그인</b-nav-item>
					<b-nav-item-dropdown text="언어" right>
						<b-dropdown-item href="/">한국어</b-dropdown-item>
						<b-dropdown-item href="/EN">English</b-dropdown-item>
					</b-nav-item-dropdown>
				</b-navbar-nav>

					
			</b-collapse>
		</b-navbar>
	</div>

</template>



<script>


export default {
}
</script>

<style>
	/* .navbar.navbar-dark.bg-dark{
		background-color: #ffffff!important;
		font-variant: normal;
	} */
	.headerbar{
		position: fixed;
		top: 0;
		left : 0;
		right : 0;
		z-index :99999
    /* position: relative; */
	}
	.ms-auto {
		margin-right: 50px;
	}
	.ms-auto>b-nav-item {
		margin-left: 10px;
		margin-right: 10px;
	}

</style>

