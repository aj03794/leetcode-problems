const { expect } = require('chai')
const { getPairsOfElementsWithMinAbsoluteDiff } = require('./index')

describe('Minimum absolute difference', () => {

    const expectedOutputOne = [ [ 1,2 ], [ 2,3 ], [ 3,4 ] ]
    const expectedOutputTwo = [ [ 1,3 ] ]
    const expectedOutputThree = [[-14,-10],[19,23],[23,27]]

    it(`should return ${expectedOutputOne}`, done => {
        const input = [ 4,2,1,3 ]
 
        const res = getPairsOfElementsWithMinAbsoluteDiff(input)

        expect(expectedOutputOne).to.deep.equal(res)

        done()
    })

    it(`should return ${expectedOutputTwo}`, done => {
        const input = [ 1,3,6,10,15 ]
 
        const res = getPairsOfElementsWithMinAbsoluteDiff(input)

        expect(expectedOutputTwo).to.deep.equal(res)

        done()
    })

    it(`should return ${expectedOutputThree}`, done => {
        const input = [3,8,-10,23,19,-4,-14,27]

        const res = getPairsOfElementsWithMinAbsoluteDiff(input)

        expect(expectedOutputThree).to.deep.equal(res)

        done()
    })

})