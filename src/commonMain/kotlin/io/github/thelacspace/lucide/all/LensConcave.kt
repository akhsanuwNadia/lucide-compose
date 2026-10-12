package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LensConcave") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                curveTo(6.6212277f,2.0f,6.274965f,2.2140024f,6.1055727f,2.5527864f)
                curveTo(5.9361806f,2.8915703f,5.972737f,3.2969823f,6.2f,3.6f)
                curveTo(9.933333f,8.577778f,9.933333f,15.422222f,6.2f,20.4f)
                curveTo(5.9727364f,20.703018f,5.93618f,21.108429f,6.105572f,21.447214f)
                curveTo(6.2749643f,21.785997f,6.6212277f,22.0f,7.0f,22.0f)
                lineTo(17.0f,22.0f)
                curveTo(17.378773f,22.0f,17.725035f,21.785997f,17.894426f,21.447212f)
                curveTo(18.063818f,21.108429f,18.027262f,20.703016f,17.8f,20.4f)
                curveTo(14.066667f,15.422222f,14.066667f,8.577778f,17.8f,3.6000004f)
                curveTo(18.027262f,3.2969828f,18.063818f,2.891571f,17.894426f,2.5527868f)
                curveTo(17.725035f,2.2140026f,17.378773f,2.0000002f,17.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.LensConcaveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LensConcave: ImageVector
    @Composable get() = LensConcaveDefinition.asImageVector()
