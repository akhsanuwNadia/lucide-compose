package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Popcorn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                curveTo(19.101078033447266,7.995075702667236,19.99107551574707,7.101089000701904,19.99107551574707,6.0)
                curveTo(19.99107551574707,4.898910999298096,19.101078033447266,4.004924297332764,18.0,4.0)
                curveTo(17.995075225830078,2.8989217281341553,17.101089477539062,2.0089242458343506,16.0,2.0089242458343506)
                curveTo(14.898910522460938,2.0089242458343506,14.004923820495605,2.8989217281341553,14.0,4.0)
                curveTo(13.995076179504395,2.8989217281341553,13.101089477539062,2.0089242458343506,12.0,2.0089242458343506)
                curveTo(10.898910522460938,2.0089242458343506,10.004923820495605,2.8989217281341553,10.0,4.0)
                curveTo(9.995076179504395,2.8989217281341553,9.101089477539062,2.0089242458343506,8.0,2.0089242458343506)
                curveTo(6.898910999298096,2.0089242458343506,6.004924297332764,2.8989217281341553,6.0,4.0)
                curveTo(4.898921966552734,4.004924297332764,4.00892448425293,4.898910999298096,4.00892448425293,6.0)
                curveTo(4.00892448425293,7.101089000701904,4.898921966552734,7.995075702667236,6.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(9.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,22.0)
                lineTo(15.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,8.0)
                curveTo(20.5,8.0,20.899999618530273,8.399999618530273,20.799999237060547,9.0)
                lineTo(18.19999885559082,21.0)
                curveTo(18.099998474121094,21.5,17.499998092651367,22.0,16.999998092651367,22.0)
                lineTo(7.0,22.0)
                curveTo(6.400000095367432,22.0,5.900000095367432,21.600000381469727,5.800000190734863,21.0)
                lineTo(3.200000047683716,9.0)
                curveTo(3.1000001430511475,8.399999618530273,3.5,8.0,4.0,8.0)
                close()
            }
}

public val LucideIcons.All.PopcornDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Popcorn: ImageVector
    @Composable get() = PopcornDefinition.asImageVector()
