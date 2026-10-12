package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(13.559999465942383,12.779999732971191)
            }
            lucidePath(strokeWidth) {
                moveTo(13.22700023651123,21.924999237060547)
                curveTo(9.07101821899414,22.43896484375,5.034944534301758,20.308979034423828,3.113927125930786,16.58795166015625)
                curveTo(1.192909598350525,12.866925239562988,1.7938507795333862,8.343032836914062,4.619688510894775,5.252564430236816)
                curveTo(7.445525646209717,2.1620965003967285,11.897701263427734,1.159664511680603,15.775375366210938,2.74079966545105)
                curveTo(19.653051376342773,4.321934700012207,22.134870529174805,8.151726722717285,21.993999481201172,12.33699893951416)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(18.0,14.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(18.0,14.0)
            }
}

public val LucideIcons.All.ClockArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowUp: ImageVector
    @Composable get() = ClockArrowUpDefinition.asImageVector()
