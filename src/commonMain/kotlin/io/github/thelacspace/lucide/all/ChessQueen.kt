package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessQueen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                curveTo(4.0f,18.89543f,4.8954306f,18.0f,6.0f,18.0f)
                lineTo(18.0f,18.0f)
                curveTo(19.10457f,18.0f,20.0f,18.89543f,20.0f,20.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(5.0f,22.0f)
                curveTo(4.4477153f,22.0f,4.0f,21.552284f,4.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.474f,5.943f)
                lineTo(14.041f,11.283f)
                curveTo(14.147511f,11.643004f,14.446688f,11.91302f,14.815692f,11.9821825f)
                curveTo(15.184696f,12.051344f,15.561349f,11.907998f,15.791f,11.611f)
                lineTo(18.407f,8.209f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,9.0f)
                lineTo(17.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.594f,8.209f)
                lineTo(8.209f,11.6119995f)
                curveTo(8.4388f,11.908975f,8.815599f,12.052182f,9.184637f,11.982803f)
                curveTo(9.553675f,11.9134245f,9.85274f,11.643153f,9.959f,11.282999f)
                lineTo(11.526f,5.942999f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                curveTo(9.996795f,4.716662f,10.377291f,5.3802605f,10.997409f,5.7395196f)
                curveTo(11.617528f,6.098779f,12.382472f,6.098779f,13.002591f,5.7395196f)
                curveTo(13.622709f,5.3802605f,14.003205f,4.716662f,14.0f,4.0f)
                curveTo(14.003205f,3.283338f,13.622709f,2.6197395f,13.002591f,2.2604802f)
                curveTo(12.382472f,1.9012209f,11.617528f,1.9012209f,10.997409f,2.2604802f)
                curveTo(10.377291f,2.6197395f,9.996795f,3.283338f,10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,7.0f)
                curveTo(17.996796f,7.716662f,18.37729f,8.38026f,18.99741f,8.73952f)
                curveTo(19.617527f,9.098779f,20.382473f,9.098779f,21.00259f,8.73952f)
                curveTo(21.62271f,8.38026f,22.003204f,7.716662f,22.0f,7.0f)
                curveTo(22.003204f,6.283338f,21.62271f,5.6197395f,21.00259f,5.2604804f)
                curveTo(20.382473f,4.901221f,19.617527f,4.901221f,18.99741f,5.2604804f)
                curveTo(18.37729f,5.6197395f,17.996796f,6.283338f,18.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,7.0f)
                curveTo(1.9967949f,7.716662f,2.3772902f,8.38026f,2.997409f,8.73952f)
                curveTo(3.617528f,9.098779f,4.382472f,9.098779f,5.0025907f,8.73952f)
                curveTo(5.6227098f,8.38026f,6.003205f,7.716662f,6.0f,7.0f)
                curveTo(6.003205f,6.283338f,5.6227098f,5.6197395f,5.0025907f,5.2604804f)
                curveTo(4.382472f,4.901221f,3.617528f,4.901221f,2.997409f,5.2604804f)
                curveTo(2.3772902f,5.6197395f,1.9967949f,6.283338f,2.0f,7.0f)
            }
}

public val LucideIcons.All.ChessQueenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessQueen: ImageVector
    @Composable get() = ChessQueenDefinition.asImageVector()
