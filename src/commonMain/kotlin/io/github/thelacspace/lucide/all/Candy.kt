package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Candy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,7.0f)
                lineTo(10.0f,17.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.1f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(16.0f,3.0f)
                curveTo(16.000086f,2.5956037f,16.243727f,2.2310653f,16.617346f,2.0763211f)
                curveTo(16.990963f,1.9215772f,17.421007f,2.0070915f,17.707f,2.293f)
                curveTo(18.268393f,2.862399f,19.068281f,3.128905f,19.859001f,3.01f)
                curveTo(20.170462f,2.9656444f,20.484638f,3.0704458f,20.707096f,3.2929041f)
                curveTo(20.929556f,3.5153625f,21.034357f,3.8295386f,20.990002f,4.141f)
                curveTo(20.871096f,4.931719f,21.137602f,5.7316084f,21.707f,6.2929997f)
                curveTo(21.992908f,6.5789943f,22.078423f,7.0090365f,21.92368f,7.3826547f)
                curveTo(21.768934f,7.756273f,21.404396f,7.999914f,21.0f,8.0f)
                lineTo(17.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.536f,7.465f)
                curveTo(15.59828f,6.527033f,14.32631f,6.0000677f,12.999999f,6.0000677f)
                curveTo(11.673688f,6.0000677f,10.401718f,6.527033f,9.463999f,7.465f)
                lineTo(7.463999f,9.465f)
                curveTo(5.5120893f,11.4175f,5.5120893f,14.5825f,7.463999f,16.535f)
                curveTo(8.401718f,17.472967f,9.673688f,17.999933f,10.999999f,17.999933f)
                curveTo(12.32631f,17.999933f,13.59828f,17.472967f,14.535999f,16.535f)
                lineTo(16.536f,14.535f)
                curveTo(18.48791f,12.5825f,18.48791f,9.417499f,16.536f,7.4649997f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,17.0f)
                lineTo(8.0f,21.0f)
                curveTo(7.9999137f,21.404396f,7.756273f,21.768934f,7.382655f,21.923677f)
                curveTo(7.009037f,22.078423f,6.5789948f,21.992908f,6.293f,21.707f)
                curveTo(5.731609f,21.137602f,4.9317193f,20.871096f,4.1410003f,20.990002f)
                curveTo(3.829539f,21.034357f,3.5153627f,20.929556f,3.2929044f,20.707098f)
                curveTo(3.070446f,20.484638f,2.9656444f,20.170462f,3.0100002f,19.859001f)
                curveTo(3.1289053f,19.068281f,2.8623993f,18.268393f,2.2930002f,17.707f)
                curveTo(2.0070918f,17.421007f,1.9215775f,16.990963f,2.0763214f,16.617346f)
                curveTo(2.2310653f,16.243727f,2.5956037f,16.000086f,3.0f,16.0f)
                lineTo(7.0f,16.0f)
            }
}

public val LucideIcons.All.CandyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Candy: ImageVector
    @Composable get() = CandyDefinition.asImageVector()
