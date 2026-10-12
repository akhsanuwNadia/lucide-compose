package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalDistributeEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,5.0f)
                lineTo(8.0f,5.0f)
                lineTo(10.0f,5.0f)
                lineTo(10.0f,19.0f)
                lineTo(8.0f,19.0f)
                lineTo(6.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(4.0f,5.0f)
                lineTo(6.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(18.0f,7.0f)
                lineTo(20.0f,7.0f)
                lineTo(20.0f,17.0f)
                lineTo(18.0f,17.0f)
                lineTo(16.0f,17.0f)
                lineTo(14.0f,17.0f)
                lineTo(14.0f,7.0f)
                lineTo(16.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,2.0f)
                lineTo(20.0f,22.0f)
            }
}

public val LucideIcons.All.AlignHorizontalDistributeEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalDistributeEnd: ImageVector
    @Composable get() = AlignHorizontalDistributeEndDefinition.asImageVector()
