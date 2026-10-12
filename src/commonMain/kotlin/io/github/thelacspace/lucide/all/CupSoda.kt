package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CupSoda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(7.75f,20.279999f)
                curveTo(7.8904996f,21.27403f,8.746136f,22.009878f,9.75f,21.999998f)
                lineTo(14.29f,21.999998f)
                curveTo(15.293864f,22.009878f,16.149502f,21.27403f,16.29f,20.279999f)
                lineTo(18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(19.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                curveTo(8.599328f,14.329983f,10.400672f,14.329983f,12.0f,15.0f)
                curveTo(13.599328f,15.670017f,15.400672f,15.670017f,17.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(13.0f,2.0f)
                lineTo(15.0f,2.0f)
            }
}

public val LucideIcons.All.CupSodaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CupSoda: ImageVector
    @Composable get() = CupSodaDefinition.asImageVector()
