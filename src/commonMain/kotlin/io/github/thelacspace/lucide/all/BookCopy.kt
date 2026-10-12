package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookCopy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                curveTo(3.895430564880371,7.0,3.0,7.895430564880371,3.0,9.0)
                lineTo(3.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.802999973297119,18.0)
                lineTo(5.0,18.0)
                curveTo(3.8989217281341553,18.004924774169922,3.0089242458343506,18.898910522460938,3.0089242458343506,20.0)
                curveTo(3.0089242458343506,21.101089477539062,3.8989217281341553,21.995075225830078,5.0,22.0)
                lineTo(14.5,22.0)
                curveTo(14.776142120361328,22.0,15.0,21.776142120361328,15.0,21.5)
                lineTo(15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(9.0,4.0)
                curveTo(9.0,2.895430564880371,9.895430564880371,2.0,11.0,2.0)
                lineTo(20.5,2.0)
                curveTo(20.776142120361328,2.0,21.0,2.2238576412200928,21.0,2.5)
                lineTo(21.0,16.5)
                curveTo(21.0,16.776142120361328,20.776142120361328,17.0,20.5,17.0)
                lineTo(11.0,17.0)
                curveTo(9.898921966552734,16.995075225830078,9.00892448425293,16.101089477539062,9.00892448425293,15.0)
                curveTo(9.00892448425293,13.898910522460938,9.898921966552734,13.004923820495605,11.0,13.0)
                lineTo(21.0,13.0)
            }
}

public val LucideIcons.All.BookCopyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookCopy: ImageVector
    @Composable get() = BookCopyDefinition.asImageVector()
