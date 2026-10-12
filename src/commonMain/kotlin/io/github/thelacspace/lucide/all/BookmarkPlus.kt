package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookmarkPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(9.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                curveTo(18.10457f,3.0f,19.0f,3.8954306f,19.0f,5.0f)
                lineTo(19.0f,20.0f)
                curveTo(18.999886f,20.356384f,18.810112f,20.685776f,18.501856f,20.864628f)
                curveTo(18.193602f,21.043482f,17.813456f,21.044767f,17.504f,20.868f)
                lineTo(12.992f,18.29f)
                curveTo(12.377276f,17.93886f,11.622723f,17.93886f,11.007999f,18.29f)
                lineTo(6.4959993f,20.868f)
                curveTo(6.186543f,21.044765f,5.806398f,21.043482f,5.498143f,20.864628f)
                curveTo(5.1898885f,20.685774f,5.000115f,20.356384f,5.0f,20.0f)
                lineTo(5.0f,5.0f)
                curveTo(5.0f,3.8954306f,5.8954306f,3.0f,7.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.BookmarkPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookmarkPlus: ImageVector
    @Composable get() = BookmarkPlusDefinition.asImageVector()
