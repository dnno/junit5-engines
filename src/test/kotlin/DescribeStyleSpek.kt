
import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object DescribeStyleSpek : Spek({

    describe("a calculator") {
        val calculator = SampleCalculator()

        on("addition") {
            val result = calculator.sum(2, 4)

            it("should return the result of adding the first number to the second number") {
                result.should.equal(6)
            }
        }

        on("subtraction") {
            val result = calculator.subtract(4, 2)

            it("should return the result of subtracting the second number from the first number") {
                result.should.equal(2)
            }
        }
    }
})