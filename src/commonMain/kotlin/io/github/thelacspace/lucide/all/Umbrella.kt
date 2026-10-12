package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Umbrella") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,13.0f)
                lineTo(12.0f,20.0f)
                curveTo(12.004924f,21.101078f,12.8989105f,21.991076f,14.0f,21.991076f)
                curveTo(15.1010895f,21.991076f,15.995076f,21.101078f,16.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.992f,13.0f)
                curveTo(21.307112f,13.002609f,21.605019f,12.856535f,21.795912f,12.605814f)
                curveTo(21.986807f,12.355093f,22.048353f,12.029058f,21.962f,11.726f)
                curveTo(20.795315f,7.1776977f,16.69605f,3.9972253f,12.0005f,3.9972253f)
                curveTo(7.304948f,3.9972253f,3.2056851f,7.1776977f,2.0389996f,11.726f)
                curveTo(1.953092f,12.027532f,2.0135772f,12.351899f,2.2023866f,12.602204f)
                curveTo(2.3911958f,12.852509f,2.6864696f,12.999771f,3.0f,13.0f)
                close()
            }
}

public val LucideIcons.All.UmbrellaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Umbrella: ImageVector
    @Composable get() = UmbrellaDefinition.asImageVector()
