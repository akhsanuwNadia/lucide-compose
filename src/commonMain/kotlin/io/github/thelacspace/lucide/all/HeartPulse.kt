package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartPulse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,9.5)
                curveTo(2.000041961669922,7.2219462394714355,3.4044439792633057,5.179690361022949,5.531608581542969,4.364399433135986)
                curveTo(7.658773422241211,3.5491080284118652,10.068388938903809,4.129542350769043,11.590999603271484,5.823999881744385)
                curveTo(11.696889877319336,5.937221527099609,11.844977378845215,6.001482963562012,12.0,6.001482963562012)
                curveTo(12.155021667480469,6.001482963562012,12.303109169006348,5.937221527099609,12.4089994430542,5.823999881744385)
                curveTo(13.927117347717285,4.1182026863098145,16.342613220214844,3.5302376747131348,18.47487449645996,4.347482204437256)
                curveTo(20.607135772705078,5.164726734161377,22.01087760925293,7.2165141105651855,22.0,9.5)
                curveTo(22.0,11.789999961853027,20.5,13.5,19.0,15.0)
                lineTo(13.507999420166016,20.312999725341797)
                curveTo(13.13106632232666,20.74591636657715,12.58629322052002,20.996009826660156,12.012288093566895,20.999643325805664)
                curveTo(11.438282012939453,21.003278732299805,10.890384674072266,20.760107040405273,10.507999420166016,20.331998825073242)
                lineTo(5.0,15.0)
                curveTo(3.5,13.5,2.0,11.800000190734863,2.0,9.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.2200000286102295,13.0)
                lineTo(9.5,13.0)
                lineTo(10.0,12.0)
                lineTo(12.0,16.5)
                lineTo(14.0,9.5)
                lineTo(15.5,13.0)
                lineTo(20.770000457763672,13.0)
            }
}

public val LucideIcons.All.HeartPulseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartPulse: ImageVector
    @Composable get() = HeartPulseDefinition.asImageVector()
