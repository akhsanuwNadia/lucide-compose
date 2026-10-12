package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.399999618530273,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,20.0)
                curveTo(4.0,21.104570388793945,4.895430564880371,22.0,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,12.600000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378000259399414,5.625999927520752)
                curveTo(21.918621063232422,5.090193748474121,22.1312313079834,4.306079387664795,21.935325622558594,3.570566415786743)
                curveTo(21.73941993713379,2.8350534439086914,21.164947509765625,2.26058030128479,20.429433822631836,2.0646750926971436)
                curveTo(19.69392204284668,1.8687695264816284,18.909807205200195,2.0813798904418945,18.374000549316406,2.621999979019165)
                lineTo(13.36400032043457,7.633999824523926)
                curveTo(13.12624740600586,7.871621608734131,12.952220916748047,8.165334701538086,12.858000755310059,8.48799991607666)
                lineTo(12.021000862121582,11.357999801635742)
                curveTo(11.969882011413574,11.533265113830566,12.018352508544922,11.722457885742188,12.14744758605957,11.851552963256836)
                curveTo(12.276542663574219,11.980648040771484,12.46573543548584,12.029118537902832,12.641000747680664,11.977999687194824)
                lineTo(15.511000633239746,11.140999794006348)
                curveTo(15.83366584777832,11.046778678894043,16.127378463745117,10.87275218963623,16.364999771118164,10.635000228881836)
                close()
            }
}

public val LucideIcons.All.NotebookPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookPen: ImageVector
    @Composable get() = NotebookPenDefinition.asImageVector()
