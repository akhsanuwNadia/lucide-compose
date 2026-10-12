package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WindArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.800000190734863,21.600000381469727)
                curveTo(13.496147155761719,22.12211036682129,14.44999885559082,22.134180068969727,15.159132957458496,21.629850387573242)
                curveTo(15.868268013000488,21.125520706176758,16.169925689697266,20.220544815063477,15.905216217041016,19.391599655151367)
                curveTo(15.64050579071045,18.56265640258789,14.870183944702148,18.0,14.0,18.0)
                lineTo(2.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,10.0)
                curveTo(18.20539093017578,9.059478759765625,19.47079086303711,8.737519264221191,20.539905548095703,9.226545333862305)
                curveTo(21.60902214050293,9.715572357177734,22.192955017089844,10.883440017700195,21.942707061767578,12.032148361206055)
                curveTo(21.692459106445312,13.180856704711914,20.67565155029297,14.0,19.5,14.0)
                lineTo(2.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(10.0,2.0)
                lineTo(14.0,6.0)
            }
}

public val LucideIcons.All.WindArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WindArrowUp: ImageVector
    @Composable get() = WindArrowUpDefinition.asImageVector()
