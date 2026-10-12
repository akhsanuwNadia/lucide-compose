package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Handbag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.048f,18.566f)
                curveTo(1.9163668f,19.15815f,2.060596f,19.778042f,2.4401076f,20.251265f)
                curveTo(2.8196194f,20.72449f,3.3933952f,20.999895f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.606606f,20.999895f,21.18038f,20.72449f,21.559893f,20.251265f)
                curveTo(21.939404f,19.778042f,22.083633f,19.15815f,21.952f,18.566f)
                lineTo(19.952f,9.566f)
                curveTo(19.748625f,8.651117f,18.937216f,8.000161f,18.0f,8.0f)
                lineTo(6.0f,8.0f)
                curveTo(5.0627847f,8.000161f,4.2513757f,8.651117f,4.048f,9.566f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.0f)
                lineTo(8.0f,6.0f)
                curveTo(8.009849f,3.7978437f,9.797822f,2.0178485f,12.0f,2.0178485f)
                curveTo(14.202178f,2.0178485f,15.990151f,3.7978437f,16.0f,6.0f)
                lineTo(16.0f,11.0f)
            }
}

public val LucideIcons.All.HandbagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Handbag: ImageVector
    @Composable get() = HandbagDefinition.asImageVector()
