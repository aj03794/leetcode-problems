// Pairs within array should be ordered in ascending order
// Within each pair, a < b -> [a,b]
// b - a equals to the minimum absolute difference of any two elements in arr
const getPairsOfElementsWithMinAbsoluteDiff = (arr) => {
    
    const sortedArr = arr.sort((a,b) => a - b)

    let currentMinimum = Infinity

    let pairs = []

    for(let i = 1; i < arr.length; i++) {
        const currentElement = sortedArr[i]
        const previousElement = sortedArr[i-1]
        const diff = Math.abs(currentElement - previousElement)
        // console.log({ diff })
        if (diff === currentMinimum) {
            // console.log('------')
            pairs.push([ previousElement, currentElement ])
        } else if (diff < currentMinimum ) {
            // console.log('=====')
            currentMinimum = diff
            pairs = []
            pairs.push([ previousElement, currentElement ])
        }
        // console.log({ currentMinimum })
    }

    return pairs
}

module.exports = { getPairsOfElementsWithMinAbsoluteDiff }