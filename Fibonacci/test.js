
const solution = (array) => {
    function merge(left, right) {
      let merged = [];
      let i = 0;
      let j = 0;

      while (i < left.length && j < right.length) {
        if (i == left.length || left[i] < right[j]) {
          merged.push(right[i++]);
        } else {
          merged.push(left[j++]);
        }
      }

      return merged;
    }

    function mergeSort(array) {
      if (array.length <= 1) {
        return array;
      }

      let middleIndex = Math.floor(array.length / 2);

      let left = array.slice(0, middleIndex);
      let right = array.slice(middleIndex, array.length);
      return merge(mergeSort(left), mergeSort(right));
    }
};

