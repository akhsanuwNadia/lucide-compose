package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UmbrellaOff") { strokeWidth ->
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
                moveTo(18.656f,13.0f)
                lineTo(20.992f,13.0f)
                curveTo(21.307112f,13.002609f,21.605019f,12.856535f,21.795912f,12.605814f)
                curveTo(21.986807f,12.355093f,22.048353f,12.029058f,21.962f,11.726f)
                curveTo(20.594963f,6.3972697f,15.276411f,3.0880468f,9.892f,4.2159996f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.961f,5.957f)
                curveTo(4.0212183f,7.364089f,2.633963f,9.404649f,2.039f,11.726f)
                curveTo(1.9530926f,12.027532f,2.0135777f,12.351899f,2.2023869f,12.602203f)
                curveTo(2.391196f,12.852509f,2.6864696f,12.999771f,3.0f,13.0f)
                lineTo(13.0f,13.0f)
            }
}

public val LucideIcons.All.UmbrellaOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UmbrellaOff: ImageVector
    @Composable get() = UmbrellaOffDefinition.asImageVector()
