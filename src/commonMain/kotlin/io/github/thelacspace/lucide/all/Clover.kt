package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Clover") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.17f,7.83f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.02f,12.0f)
                curveTo(3.2219872f,11.333269f,2.854434f,10.282255f,3.063012f,9.263506f)
                curveTo(3.2715898f,8.244757f,4.0226216f,7.422761f,5.0184517f,7.1232996f)
                curveTo(6.014282f,6.823838f,7.094122f,7.095263f,7.83f,7.83f)
                curveTo(7.095263f,7.094122f,6.823838f,6.014282f,7.1232996f,5.0184517f)
                curveTo(7.422761f,4.0226216f,8.244757f,3.2715898f,9.263506f,3.063012f)
                curveTo(10.282255f,2.854434f,11.333269f,3.2219872f,12.0f,4.02f)
                curveTo(12.666731f,3.2219872f,13.717745f,2.854434f,14.736494f,3.063012f)
                curveTo(15.755243f,3.2715898f,16.57724f,4.0226216f,16.876701f,5.0184517f)
                curveTo(17.17616f,6.014282f,16.904737f,7.094122f,16.17f,7.83f)
                curveTo(16.905878f,7.095261f,17.985718f,6.823836f,18.98155f,7.1232967f)
                curveTo(19.97738f,7.422758f,20.728413f,8.244754f,20.93699f,9.263505f)
                curveTo(21.145569f,10.282255f,20.778013f,11.333269f,19.98f,12.0f)
                curveTo(20.778013f,12.666731f,21.145569f,13.717745f,20.93699f,14.736495f)
                curveTo(20.728413f,15.755246f,19.97738f,16.577242f,18.98155f,16.876703f)
                curveTo(17.985718f,17.176165f,16.905878f,16.90474f,16.17f,16.17f)
                curveTo(16.90474f,16.905878f,17.176165f,17.985718f,16.876703f,18.98155f)
                curveTo(16.577242f,19.97738f,15.755246f,20.728413f,14.736495f,20.93699f)
                curveTo(13.717745f,21.145569f,12.666731f,20.778013f,12.0f,19.98f)
                curveTo(11.333269f,20.778013f,10.282255f,21.145569f,9.263505f,20.93699f)
                curveTo(8.244754f,20.728413f,7.422758f,19.97738f,7.1232967f,18.98155f)
                curveTo(6.823836f,17.985718f,7.095261f,16.905878f,7.83f,16.17f)
                curveTo(7.0859485f,16.859545f,6.029823f,17.098274f,5.0615315f,16.795792f)
                curveTo(4.09324f,16.493309f,3.3608055f,15.695854f,3.1415699f,14.705389f)
                curveTo(2.922334f,13.714925f,3.2498112f,12.682862f,4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.83f,7.83f)
                lineTo(16.17f,16.17f)
            }
}

public val LucideIcons.All.CloverDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Clover: ImageVector
    @Composable get() = CloverDefinition.asImageVector()
