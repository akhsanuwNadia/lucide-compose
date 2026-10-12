package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookCopy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                curveTo(3.8954306f,7.0f,3.0f,7.8954306f,3.0f,9.0f)
                lineTo(3.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.803f,18.0f)
                lineTo(5.0f,18.0f)
                curveTo(3.8989217f,18.004925f,3.0089242f,18.89891f,3.0089242f,20.0f)
                curveTo(3.0089242f,21.10109f,3.8989217f,21.995075f,5.0f,22.0f)
                lineTo(14.5f,22.0f)
                curveTo(14.776142f,22.0f,15.0f,21.776142f,15.0f,21.5f)
                lineTo(15.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                lineTo(9.0f,4.0f)
                curveTo(9.0f,2.8954306f,9.895431f,2.0f,11.0f,2.0f)
                lineTo(20.5f,2.0f)
                curveTo(20.776142f,2.0f,21.0f,2.2238576f,21.0f,2.5f)
                lineTo(21.0f,16.5f)
                curveTo(21.0f,16.776142f,20.776142f,17.0f,20.5f,17.0f)
                lineTo(11.0f,17.0f)
                curveTo(9.898922f,16.995075f,9.0089245f,16.10109f,9.0089245f,15.0f)
                curveTo(9.0089245f,13.8989105f,9.898922f,13.004924f,11.0f,13.0f)
                lineTo(21.0f,13.0f)
            }
}

public val LucideIcons.All.BookCopyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookCopy: ImageVector
    @Composable get() = BookCopyDefinition.asImageVector()
