package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TableColumnsSplit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,14.0)
                lineTo(14.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(14.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,15.0)
                lineTo(10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,3.0)
                lineTo(8.0,3.0)
                curveTo(9.104569435119629,3.0,10.0,3.895430564880371,10.0,5.0)
                lineTo(10.0,19.0)
                curveTo(10.0,20.104570388793945,9.104569435119629,21.0,8.0,21.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,15.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,3.0)
                lineTo(20.0,3.0)
                curveTo(18.895429611206055,3.0,18.0,3.895430564880371,18.0,5.0)
                lineTo(18.0,19.0)
                curveTo(18.0,20.104570388793945,18.895429611206055,21.0,20.0,21.0)
                lineTo(22.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,9.0)
                lineTo(18.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(5.0,21.0)
            }
}

public val LucideIcons.All.TableColumnsSplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TableColumnsSplit: ImageVector
    @Composable get() = TableColumnsSplitDefinition.asImageVector()
