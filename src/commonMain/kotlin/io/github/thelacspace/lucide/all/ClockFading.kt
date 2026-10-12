package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockFading") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                curveTo(15.964218139648438,1.9992769956588745,19.55459976196289,4.34032678604126,21.1529598236084,7.968036651611328)
                curveTo(22.751317977905273,11.595746040344238,22.055849075317383,15.825129508972168,19.380001068115234,18.75)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5,8.875)
                curveTo(2.181349754333496,9.843657493591309,2.012733221054077,10.855356216430664,2.0,11.875)
            }
            lucidePath(strokeWidth) {
                moveTo(2.8299999237060547,16.0)
                curveTo(3.3915011882781982,17.291828155517578,4.219581604003906,18.450458526611328,5.260000228881836,19.399999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(4.636000156402588,5.235000133514404)
                curveTo(4.915040969848633,4.9312310218811035,5.21260929107666,4.645017623901367,5.5269999504089355,4.378000259399414)
            }
            lucidePath(strokeWidth) {
                moveTo(8.644000053405762,21.420000076293945)
                curveTo(11.137696266174316,22.308368682861328,13.88189697265625,22.171716690063477,16.274999618530273,21.040000915527344)
            }
}

public val LucideIcons.All.ClockFadingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockFading: ImageVector
    @Composable get() = ClockFadingDefinition.asImageVector()
