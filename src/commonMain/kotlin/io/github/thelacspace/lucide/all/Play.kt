package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Play") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,5.0f)
                curveTo(4.999788f,4.2837105f,5.3826523f,3.6219978f,6.003751f,3.2651966f)
                curveTo(6.6248493f,2.908395f,7.3893375f,2.91099f,8.007999f,3.2719998f)
                lineTo(20.005f,10.27f)
                curveTo(20.621143f,10.62752f,21.000616f,11.28578f,21.001234f,11.998137f)
                curveTo(21.001852f,12.710495f,20.623522f,13.369412f,20.008f,13.728001f)
                lineTo(8.007999f,20.728f)
                curveTo(7.3893375f,21.08901f,6.6248493f,21.091606f,6.003751f,20.734804f)
                curveTo(5.382652f,20.378002f,4.999788f,19.71629f,5.0f,19.0f)
                close()
            }
}

public val LucideIcons.All.PlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Play: ImageVector
    @Composable get() = PlayDefinition.asImageVector()
