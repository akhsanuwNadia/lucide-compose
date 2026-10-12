package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookOpenText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,13.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,9.0f)
                lineTo(18.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.001f,19.0f)
                curveTo(21.105179f,18.999449f,22.0f,18.10418f,22.0f,17.0f)
                lineTo(22.0f,5.0f)
                curveTo(22.0f,3.8958206f,21.105179f,3.0005517f,20.001f,3.0f)
                lineTo(16.0f,3.002f)
                curveTo(14.426565f,3.0015278f,12.94469f,3.7417245f,12.0f,5.0f)
                curveTo(11.055728f,3.7409708f,9.573787f,3.0f,8.0f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,17.0f)
                curveTo(1.9999999f,18.10418f,2.8948212f,18.999449f,3.999f,19.0f)
                lineTo(8.0f,19.0f)
                curveTo(9.573787f,19.0f,11.055728f,19.74097f,12.0f,21.0f)
                curveTo(12.944272f,19.74097f,14.426213f,19.0f,16.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(8.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                lineTo(8.0f,9.0f)
            }
}

public val LucideIcons.All.BookOpenTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookOpenText: ImageVector
    @Composable get() = BookOpenTextDefinition.asImageVector()
