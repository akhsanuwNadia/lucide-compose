package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SplinePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.034f,12.681f)
                curveTo(11.960317f,12.496147f,12.003753f,12.285175f,12.1444645f,12.144464f)
                curveTo(12.285176f,12.003752f,12.496148f,11.960316f,12.681001f,12.033999f)
                lineTo(21.681f,15.533999f)
                curveTo(21.878754f,15.611272f,22.006144f,15.80501f,21.998718f,16.017195f)
                curveTo(21.991293f,16.229382f,21.850672f,16.41374f,21.647999f,16.477f)
                lineTo(18.203999f,17.545f)
                curveTo(17.888523f,17.642538f,17.641537f,17.889524f,17.543999f,18.205f)
                lineTo(16.477f,21.648f)
                curveTo(16.41374f,21.850674f,16.229382f,21.991295f,16.017195f,21.99872f)
                curveTo(15.80501f,22.006145f,15.611272f,21.878756f,15.533999f,21.681002f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                curveTo(5.0f,10.372583f,10.372583f,5.0f,17.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,5.0f)
                curveTo(16.996796f,5.716662f,17.37729f,6.3802605f,17.99741f,6.7395196f)
                curveTo(18.617527f,7.098779f,19.382473f,7.098779f,20.00259f,6.7395196f)
                curveTo(20.62271f,6.3802605f,21.003204f,5.716662f,21.0f,5.0f)
                curveTo(21.003204f,4.283338f,20.62271f,3.6197395f,20.00259f,3.2604802f)
                curveTo(19.382473f,2.9012208f,18.617527f,2.9012208f,17.99741f,3.2604802f)
                curveTo(17.37729f,3.6197395f,16.996796f,4.283338f,17.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(2.996795f,19.716661f,3.3772902f,20.38026f,3.997409f,20.73952f)
                curveTo(4.617528f,21.09878f,5.382472f,21.09878f,6.0025907f,20.73952f)
                curveTo(6.6227098f,20.38026f,7.003205f,19.716661f,7.0f,19.0f)
                curveTo(7.003205f,18.283339f,6.6227098f,17.61974f,6.0025907f,17.26048f)
                curveTo(5.382472f,16.90122f,4.617528f,16.90122f,3.997409f,17.26048f)
                curveTo(3.3772902f,17.61974f,2.996795f,18.283339f,3.0f,19.0f)
            }
}

public val LucideIcons.All.SplinePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SplinePointer: ImageVector
    @Composable get() = SplinePointerDefinition.asImageVector()
