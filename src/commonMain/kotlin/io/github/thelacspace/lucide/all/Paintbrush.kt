package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Paintbrush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.622f,17.897f)
                lineTo(3.9419994f,14.983999f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.376f,2.622f)
                curveTo(18.91145f,2.0817397f,19.695042f,1.8692707f,20.430065f,2.0650456f)
                curveTo(21.165089f,2.2608206f,21.73918f,2.834911f,21.934954f,3.5699346f)
                curveTo(22.13073f,4.304958f,21.91826f,5.0885506f,21.378f,5.624f)
                lineTo(17.36f,9.643f)
                curveTo(17.16481f,9.838249f,17.16481f,10.15475f,17.36f,10.349999f)
                lineTo(18.304f,11.294f)
                curveTo(19.244995f,12.235134f,19.244995f,13.760865f,18.304f,14.702f)
                lineTo(17.36f,15.646f)
                curveTo(17.164751f,15.841191f,16.84825f,15.841191f,16.653f,15.646f)
                lineTo(8.354f,7.348f)
                curveTo(8.158809f,7.15275f,8.158809f,6.83625f,8.354f,6.641f)
                lineTo(9.298f,5.6969995f)
                curveTo(10.239135f,4.756006f,11.764866f,4.756006f,12.706f,5.6969995f)
                lineTo(13.650001f,6.641f)
                curveTo(13.84525f,6.8361907f,14.161751f,6.8361907f,14.357f,6.641f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,8.0f)
                curveTo(7.196f,10.71f,5.0299997f,11.46f,2.4169998f,11.948f)
                curveTo(2.2406368f,11.980198f,2.0943902f,12.103143f,2.032365f,12.271349f)
                curveTo(1.9703403f,12.439556f,2.0017598f,12.628014f,2.1149998f,12.767f)
                lineTo(9.434999f,21.650002f)
                curveTo(9.740439f,21.97441f,10.223662f,22.057596f,10.619999f,21.854002f)
                curveTo(12.735f,20.405f,16.0f,16.792f,16.0f,15.0f)
            }
}

public val LucideIcons.All.PaintbrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Paintbrush: ImageVector
    @Composable get() = PaintbrushDefinition.asImageVector()
