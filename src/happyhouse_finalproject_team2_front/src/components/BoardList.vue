<template>
	<section class="blsection">
		<transition-group name="list" tag="ul">
			<li v-for="(board, index) in boardlist.content" :key="index" class="shadow">
				<span @click="showBoard(board.id)">
					{{ board.id}}. {{ board.title }}
				</span>
			</li>
		</transition-group>
	</section>
</template>

<script>
export default {
  created() {
			//store안의 actions 중 ALLTODO 호출해서 데이터 가져오라고 부탁
			this.$store.dispatch("ALLBOARD"); //ACTION CALL
	},
  computed: {
		boardlist() {
				console.log(this.$store.state.boardlist.length);
				return this.$store.state.boardlist;//data를 직접 접근
		},
			
	},
  methods: {
    showBoard(num) {
				//화면이 바뀌어야 함
				this.$router.push("/detail/" + num);
		},
  }
}
</script>

<style>
  #app{
    padding-top :65px;
  }
  .del {
		text-decoration: line-through;
	}
	ul {
		list-style-type: none;
		padding-left: 0px;
		margin-top: 0;
		text-align: left;
	}
	li {
		display: flex;
		min-height: 50px;
		height: 50px;
		line-height: 50px;
		margin: 0.5rem 0;
		padding: 0 0.9rem;
		background: white;
		border-radius: 5px;
	}
  .blsection{
    padding-top: 20px;
  }
	
	.list-enter-active,
	.list-leave-active {
		transition: all 1s;
	}
	.list-enter,
	.list-leave-to {
		opacity: 0;
		transform: translateY(30px);
	}
</style>