<template>
  <div class="about">
    <h1>가위바위보</h1>

    입력: <input type="text" v-model="play.inputValue" placeholder="가위:2, 주먹:0, 보:5">
    <button type="button" @click="playGame(play.inputValue)">게임</button>
    <br>
    <br>
    결과: <input type="text" v-model="result" disabled>
  </div>
</template>
<script>
import axios from 'axios';

export default {
  data () {
    return {
      play: {
        inputValue: ''
      },
      result: ''
    }
  },
  methods: {
    async playGame (inputValue) {
      const validPattern = /^[205]+$/;
      if(!validPattern.test(inputValue)){
        alert("숫자는 2,0,5를 포함한 값만 입력가능합니다.");
        return;
      }else{
        const response = await axios.get('http://localhost:8080/api/about',{
          params: {
            inputValue: inputValue
          }
        });
        this.result = response.data;
      }
    }
  }

}
</script>
