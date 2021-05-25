<template>
  <div class="body">
    <b-carousel
      id="carousel-fade"
      style="text-shadow: 0px 0px 2px #000"
      fade
      indicators
      :interval="4000"
      img-width="1024"
      img-height="480"
    >
      <b-carousel-slide
        caption="사진 예쁜거 넣고"
        img-src="https://picsum.photos/1024/480/?image=10"
      ></b-carousel-slide>
      <b-carousel-slide
        caption="당신의 집은 어디인가요?"
        text = "이러면 되지 않을까?"
        img-src="https://picsum.photos/1024/480/?image=12"
      ></b-carousel-slide>
      <b-carousel-slide
        caption="걍 내 생각임"
        text = "근데 carousel은 꼭 적용하고 npm을 껐다가 다시 켜야하나 귀찮네"
        img-src="https://picsum.photos/1024/480/?image=22"
      ></b-carousel-slide>
    </b-carousel>

    <br> <br> <br>

    <h2>내 집을 마련할 위치를 검색해보세요</h2>
    <br> <br>

    <b-dropdown text="시/도" margin-right="10px">
      <b-dropdown-item href="#">여기에 DB 받아오기</b-dropdown-item>
      <b-dropdown-item href="#">서울시 인천시 등등</b-dropdown-item>
    </b-dropdown>&nbsp;

    <b-dropdown>
      <template #button-content>
        구/군
      </template>
      <b-dropdown-item href="#">여기에 DB 받아오기</b-dropdown-item>
      <b-dropdown-item href="#">강남구 강북구 등등</b-dropdown-item>
    </b-dropdown>&nbsp;

    <b-dropdown>
      <template #button-content>
        읍/면/동
      </template>
      <b-dropdown-item href="#">여기에 DB 받아오기</b-dropdown-item>
      <b-dropdown-item href="#">목동, 가리봉동 등등</b-dropdown-item>
    </b-dropdown>&nbsp;
    
    <b-button variant="outline-primary">검색</b-button>

    <br> <br> <br>

    <h1> Team 뀨우는요.. </h1>
  </div>

  

  <!-- <div id="app">
    <h2>내 집을 마련할 위치를 검색해보세요</h2>

    <b-dropdown text="시/도" margin-right="10px">
      <b-dropdown-item href="#">An item</b-dropdown-item>
      <b-dropdown-item href="#">Another item</b-dropdown-item>
    </b-dropdown>

    <b-dropdown>
      <template #button-content>
        구/군
      </template>
      <b-dropdown-item href="#">An item</b-dropdown-item>
      <b-dropdown-item href="#">Another item</b-dropdown-item>
    </b-dropdown>

    <b-dropdown>
      <template #button-content>
        읍/면/동
      </template>
      <b-dropdown-item href="#">An item</b-dropdown-item>
      <b-dropdown-item href="#">Another item</b-dropdown-item>
    </b-dropdown>
    <b-button variant="outline-primary">검색</b-button>
  </div> -->

</template>

<script>
  export default {
  }
</script>

<style scoped>
  .body{
    padding-top :65px;
  }
</style>