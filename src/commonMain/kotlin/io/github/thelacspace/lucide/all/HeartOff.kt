package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5,4.89300012588501)
                curveTo(10.90274429321289,5.154383182525635,11.26952838897705,5.467377185821533,11.590999603271484,5.824000358581543)
                curveTo(11.696889877319336,5.937222003936768,11.844977378845215,6.00148344039917,12.0,6.00148344039917)
                curveTo(12.155021667480469,6.00148344039917,12.303109169006348,5.937222003936768,12.4089994430542,5.824000358581543)
                curveTo(13.927117347717285,4.118203163146973,16.342613220214844,3.530238151550293,18.47487449645996,4.347482681274414)
                curveTo(20.607135772705078,5.164726734161377,22.01087760925293,7.2165141105651855,22.0,9.5)
                curveTo(22.0,11.371999740600586,20.99799919128418,12.855999946594238,19.812999725341797,14.155000686645508)
            }
            lucidePath(strokeWidth) {
                moveTo(16.966999053955078,16.966999053955078)
                lineTo(13.507999420166016,20.312999725341797)
                curveTo(13.13106632232666,20.74591636657715,12.58629322052002,20.996009826660156,12.012288093566895,20.999643325805664)
                curveTo(11.438282012939453,21.003278732299805,10.890384674072266,20.760107040405273,10.507999420166016,20.331998825073242)
                lineTo(5.0,15.0)
                curveTo(3.5,13.5,2.0,11.800000190734863,2.0,9.5)
                curveTo(2.0001449584960938,7.536422252655029,3.0471103191375732,5.721859931945801,4.746999740600586,4.738999843597412)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.HeartOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartOff: ImageVector
    @Composable get() = HeartOffDefinition.asImageVector()
