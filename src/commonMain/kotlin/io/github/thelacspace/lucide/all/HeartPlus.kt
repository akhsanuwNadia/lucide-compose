package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.479000091552734,19.374000549316406)
                lineTo(13.508000373840332,20.312999725341797)
                curveTo(13.131067276000977,20.74591636657715,12.586294174194336,20.996009826660156,12.012289047241211,20.999643325805664)
                curveTo(11.43828296661377,21.003278732299805,10.890385627746582,20.760107040405273,10.508000373840332,20.331998825073242)
                lineTo(5.0,15.0)
                curveTo(3.5,13.5,2.0,11.800000190734863,2.0,9.5)
                curveTo(2.000041961669922,7.2219462394714355,3.4044439792633057,5.179690361022949,5.531608581542969,4.364399433135986)
                curveTo(7.658773422241211,3.5491080284118652,10.068388938903809,4.129542350769043,11.590999603271484,5.823999881744385)
                curveTo(11.696889877319336,5.937221527099609,11.844977378845215,6.001482963562012,12.0,6.001482963562012)
                curveTo(12.155021667480469,6.001482963562012,12.303109169006348,5.937221527099609,12.4089994430542,5.823999881744385)
                curveTo(13.927117347717285,4.1182026863098145,16.342613220214844,3.5302376747131348,18.47487449645996,4.347482204437256)
                curveTo(20.607135772705078,5.164726734161377,22.01087760925293,7.2165141105651855,22.0,9.5)
                curveTo(21.99968910217285,10.00466251373291,21.92591667175293,10.506591796875,21.7810001373291,10.989999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(21.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.0,18.0)
            }
}

public val LucideIcons.All.HeartPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartPlus: ImageVector
    @Composable get() = HeartPlusDefinition.asImageVector()
