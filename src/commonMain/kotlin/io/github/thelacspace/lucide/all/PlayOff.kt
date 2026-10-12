package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.215f,4.56f)
                lineTo(20.005001f,10.27f)
                curveTo(20.621145f,10.62752f,21.000618f,11.28578f,21.001236f,11.998137f)
                curveTo(21.001854f,12.710495f,20.623524f,13.369412f,20.008001f,13.728001f)
                lineTo(19.615002f,13.958f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.042f,16.042f)
                lineTo(8.007999f,20.728f)
                curveTo(7.3893375f,21.08901f,6.6248493f,21.091606f,6.003751f,20.734804f)
                curveTo(5.382652f,20.378002f,4.999788f,19.71629f,5.0f,19.0f)
                lineTo(5.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.PlayOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayOff: ImageVector
    @Composable get() = PlayOffDefinition.asImageVector()
